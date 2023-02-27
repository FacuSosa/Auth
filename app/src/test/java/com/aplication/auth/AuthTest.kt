package com.aplication.auth

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AuthTest {
    @Test
    fun login_complete_returnsTrue(){
        val isAtuhenticated = userAuthentication("ant@gmail.com", "1234")
        assertTrue(isAtuhenticated)
    }
    @Test
    fun login_complete_returnsFalse(){
        val isAtuhenticated = userAuthentication("nt@gmail.com", "1234")
        assertFalse(isAtuhenticated)
    }
    @Test
    fun login_emptyEmail_returnsFalse(){
        val isAtuhenticated = userAuthentication("", "1234")
        assertFalse(isAtuhenticated)
    }
    /*  - TDD -
    @Test
    fun login_nullEmail_returnsFalse(){
        val isAtuhenticated = userAuthenticationTDD(null, "1234")
        assertFalse(isAtuhenticated)
    }
    @Test
    fun login_nullPassword_returnsFalse(){
        val isAtuhenticated = userAuthenticationTDD("ant@gmail.com", null)
        assertFalse(isAtuhenticated)
    }*/
}