/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.security.interfaces;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package tests.security.interfaces;
 */

public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = tests.TestSuiteFactory.createTestSuite("All tests for package tests.security.interfaces;");
        // $JUnit-BEGIN$

        suite.addTestSuite(DSAKeyTest.class);
        suite.addTestSuite(DSAParamsTest.class);
        suite.addTestSuite(DSAKeyPairGeneratorTest.class);
        suite.addTestSuite(RSAMultiPrimePrivateCrtKeyTest.class);
        suite.addTestSuite(DSAPrivateKeyTest.class);
        suite.addTestSuite(DSAPublicKeyTest.class);
        suite.addTestSuite(RSAKeyTest.class);
        suite.addTestSuite(RSAPrivateCrtKeyTest.class);
        suite.addTestSuite(RSAPrivateKeyTest.class);
        suite.addTestSuite(RSAPublicKeyTest.class);

        // $JUnit-END$
        return suite;
    }
}
