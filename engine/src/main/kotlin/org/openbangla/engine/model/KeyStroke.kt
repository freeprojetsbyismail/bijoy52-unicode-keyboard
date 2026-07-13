package org.openbangla.engine.model

data class KeyStroke(
    val keyCode: Int,
    val shift: Boolean = false,
    val alt: Boolean = false,
    val ctrl: Boolean = false
)
