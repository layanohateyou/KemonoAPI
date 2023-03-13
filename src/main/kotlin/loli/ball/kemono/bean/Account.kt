package loli.ball.kemono.bean

import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val username: String,               //tên tài khoản
    val password: String,               //mật khẩu
    val cookie: String,                 //cookie có giá trị trong một tháng
    val expiresTimestamp: Long          //thời gian hết hạn cookie
) {
    val isExpired = System.currentTimeMillis() > expiresTimestamp
}
