fun encrypt(message: String, shift: Int): String {
    val result = StringBuilder()

    for (char in message) {
        when {
            char.isUpperCase() -> {
                val shifted = ((char - 'A' + shift) % 26 + 26) % 26 + 'A'.code
                result.append(shifted.toChar())
            }
            char.isLowerCase() -> {
                val shifted = ((char - 'a' + shift) % 26 + 26) % 26 + 'a'.code
                result.append(shifted.toChar())
            }
            else -> result.append(char) // Non-alphabetic characters remain unchanged
        }
    }

    return result.toString()
}

fun decrypt(message: String, shift: Int): String {
    return encrypt(message, -shift) // Decryption is encryption with negative shift
}

fun main() {
    val message = "Hello, World!"
    val shift = 3

    val encrypted = encrypt(message, shift)
    println("Encrypted: $encrypted") // Output: Khoor, Zruog!

    val decrypted = decrypt(encrypted, shift)
    println("Decrypted: $decrypted") // Output: Hello, World!
}
