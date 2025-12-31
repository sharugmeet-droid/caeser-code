# 🔐 Caesar Cipher – Kotlin

This Kotlin program implements the **Caesar Cipher**, a classic encryption technique.  
It allows **encrypting** and **decrypting** messages using a shift key.

---

## 🧠 How It Works

- Each alphabet character is **shifted** by a fixed number (shift key):
  - Uppercase letters: `'A'..'Z'`
  - Lowercase letters: `'a'..'z'`
- Non-alphabetic characters (spaces, numbers, punctuation) remain unchanged.
- **Decryption** is simply encryption with a **negative shift**.

---

## 🧩 Implementation

### Functions
```kotlin
fun encrypt(message: String, shift: Int): String
fun decrypt(message: String, shift: Int): String
