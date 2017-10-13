package org.kethereum.crypto

import junit.framework.Assert.assertFalse
import org.junit.Test
import org.kethereum.crypto.SecureRandomUtils.secureRandom

class SecureRandomUtilsTest {

    @Test
    fun testSecureRandom() {
        secureRandom().nextInt();
    }

    @Test
    fun testIsNotAndroidRuntime() {
        assertFalse(SecureRandomUtils.isAndroidRuntime)
    }
}
