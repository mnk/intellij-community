// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.idea.devkit.kotlin.inspections

import com.intellij.testFramework.TestDataPath
import org.jetbrains.idea.devkit.inspections.quickfix.LightServiceMustBeFinalInspectionTestBase
import org.jetbrains.idea.devkit.kotlin.DevkitKtTestsUtil

@TestDataPath("\$CONTENT_ROOT/testData/inspections/lightServiceMustBeFinal")
class KtLightServiceMustBeFinalInspectionTest : LightServiceMustBeFinalInspectionTestBase() {

  override fun getBasePath() = DevkitKtTestsUtil.TESTDATA_PATH + "inspections/lightServiceMustBeFinal/"

  override fun getFileExtension() = "kt"

  fun testMakeNotOpen() {
    doTest("Make 'MyService' not open")
  }
}
