package com.aplication.auth

class AuthException(val authEvent: AuthEvent, msg: String? = null) : Exception(msg)