package com.example.phamlethieuquang_332

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    // Khai báo biến cho màn hình trái (Login)
    private lateinit var phoneLeft_332: LinearLayout
    private lateinit var logoLeft_332: ImageView
    private lateinit var loginForm_332: LinearLayout
    private lateinit var usernameInput_332: EditText
    private lateinit var passwordInput_332: EditText
    private lateinit var loginButton_332: Button
    private lateinit var lostPassword_332: TextView

    // Khai báo biến cho màn hình phải (Profile)
    private lateinit var phoneRight_332: LinearLayout
    private lateinit var avatar_332: ImageView
    private lateinit var statsLayout_332: LinearLayout
    private lateinit var statLeft_332: TextView
    private lateinit var statRight_332: TextView
    private lateinit var profileForm_332: LinearLayout
    private lateinit var emailInput_332: EditText
    private lateinit var phoneInput_332: EditText
    private lateinit var skypeInput_332: EditText
    private lateinit var webInput_332: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo các view
        initViews_332()

        // Thiết lập sự kiện
        setupEvents_332()

        // Thiết lập dữ liệu mặc định
        setupDefaultData_332()
    }

    private fun initViews_332() {
        // Màn hình trái (Login)
        phoneLeft_332 = findViewById(R.id.phone_left_332)
        logoLeft_332 = findViewById(R.id.logo_left_332)
        loginForm_332 = findViewById(R.id.login_form_332)
        usernameInput_332 = findViewById(R.id.username_input_332)
        passwordInput_332 = findViewById(R.id.password_input_332)
        loginButton_332 = findViewById(R.id.login_button_332)
        lostPassword_332 = findViewById(R.id.lost_password_332)

        // Màn hình phải (Profile)
        phoneRight_332 = findViewById(R.id.phone_right_332)
        avatar_332 = findViewById(R.id.avatar_332)
        statsLayout_332 = findViewById(R.id.stats_layout_332)
        statLeft_332 = findViewById(R.id.stat_left_332)
        statRight_332 = findViewById(R.id.stat_right_332)
        profileForm_332 = findViewById(R.id.profile_form_332)
        emailInput_332 = findViewById(R.id.email_input_332)
        phoneInput_332 = findViewById(R.id.phone_input_332)
        skypeInput_332 = findViewById(R.id.skype_input_332)
        webInput_332 = findViewById(R.id.web_input_332)
    }

    private fun setupEvents_332() {
        // Xử lý sự kiện click cho nút Login
        loginButton_332.setOnClickListener {
            handleLogin_332()
        }

        // Xử lý sự kiện click cho "Lost password"
        lostPassword_332.setOnClickListener {
            handleLostPassword_332()
        }

        // Xử lý sự kiện click cho avatar
        avatar_332.setOnClickListener {
            handleAvatarClick_332()
        }

        // Xử lý sự kiện click cho stats
        statLeft_332.setOnClickListener {
            handleStatClick_332("left")
        }

        statRight_332.setOnClickListener {
            handleStatClick_332("right")
        }
    }

    private fun setupDefaultData_332() {
        // Thiết lập placeholder text cho các input
        usernameInput_332.hint = "User Name"
        passwordInput_332.hint = "••••••••••••"

        emailInput_332.setText("Email : mail@email.com")
        phoneInput_332.setText("Phone : +99 999 555 222")
        skypeInput_332.setText("Skype : myskpie")
        webInput_332.setText("Web : mywebsite.com")

        // Thiết lập số liệu thống kê
        statLeft_332.text = "125"
        statRight_332.text = "250"
    }

    private fun handleLogin_332() {
        val username = usernameInput_332.text.toString().trim()
        val password = passwordInput_332.text.toString().trim()

        when {
            username.isEmpty() -> {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
                return
            }
            password.isEmpty() -> {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
                return
            }
            else -> {
                // Giả lập đăng nhập thành công
                Toast.makeText(this, "Login successful! Welcome $username", Toast.LENGTH_LONG).show()

                // Cập nhật giao diện profile
                updateProfileData_332(username)
            }
        }
    }

    private fun handleLostPassword_332() {
        Toast.makeText(this, "Password recovery feature", Toast.LENGTH_SHORT).show()
        // Có thể thêm logic để hiển thị dialog nhập email khôi phục
    }

    private fun handleAvatarClick_332() {
        Toast.makeText(this, "Avatar clicked - Change photo feature", Toast.LENGTH_SHORT).show()
        // Có thể thêm logic để chọn ảnh từ gallery
    }

    private fun handleStatClick_332(position: String) {
        when (position) {
            "left" -> {
                val currentValue = statLeft_332.text.toString().toInt()
                statLeft_332.text = (currentValue + 1).toString()
                Toast.makeText(this, "Left stat increased!", Toast.LENGTH_SHORT).show()
            }
            "right" -> {
                val currentValue = statRight_332.text.toString().toInt()
                statRight_332.text = (currentValue + 1).toString()
                Toast.makeText(this, "Right stat increased!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updateProfileData_332(username: String) {
        // Cập nhật thông tin profile sau khi login
        emailInput_332.setText("Email : ${username.lowercase()}@email.com")

        // Tăng stats khi login thành công
        val leftStat = statLeft_332.text.toString().toInt()
        val rightStat = statRight_332.text.toString().toInt()

        statLeft_332.text = (leftStat + 1).toString()
        statRight_332.text = (rightStat + 2).toString()
    }

    // Method để reset form login
    private fun resetLoginForm_332() {
        usernameInput_332.setText("")
        passwordInput_332.setText("")
    }

    // Method để reset profile data
    private fun resetProfileData_332() {
        emailInput_332.setText("Email : mail@email.com")
        phoneInput_332.setText("Phone : +99 999 555 222")
        skypeInput_332.setText("Skype : myskpie")
        webInput_332.setText("Web : mywebsite.com")
        statLeft_332.text = "125"
        statRight_332.text = "250"
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        // Xử lý khi nhấn nút back
        super.onBackPressed()
    }
}