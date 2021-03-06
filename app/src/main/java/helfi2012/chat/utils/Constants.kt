package helfi2012.chat.utils


import android.Manifest

object Constants {
    /* App Preferences */
    val PERMISSIONS = arrayOf(
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
    )
    val APP_PREFERENCES_LOGIN_ACTIVITY_REQUEST = 10
    val APP_PREFERENCES_CHATTING_ACTIVITY_REQUEST = 20
    val APP_PREFERENCES_PERMISSION_REQUEST = 30
    val APP_PREFERENCES_CHANGE_AVATAR_REQUEST = 40
    val APP_PREFERENCES_REQUEST_CODE_GALLERY_PHOTO = 50
    val APP_PREFERENCES_REQUEST_CODE_CAMERA_PHOTO = 60
    val APP_PREFERENCES_USER_REQUEST = "THAT USER"
    val APP_PREFERENCES_INTENT_GALLERY_TYPE = "image/*"
    val APP_PREFERENCES_INTENT_CAPTURE_TYPE = "capture/*"
    val APP_PREFERENCES_PHONE_CALL_NOTIFICATION_ID = 10
    val APP_PREFERENCES_NEW_MESSAGE_NOTIFICATION_ID = 20
    val APP_PREFERENCES_DIRECTORY_BASE = "/Chat/"
    val APP_PREFERENCES_PHONE_CALL = "helfi2012.PHONE_CALL"
    val APP_PREFERENCES_FULLSCREEN_IMAGE = "helfi2012.FULLSCREEN_ACTIVITY_FILE_PATH"
    /* */
    val LOGIN_MIN_LENGTH = 6
    val PASSWORD_MIN_LENGTH = 6
    val AVATAR_PATH_PREFIX = "avatar"
    val IMAGE_TYPE = ".jpeg"
    val TIMER_TICK: Long = 50
    val TIMER_DELAY: Long = 10
    val DEFAULT_PICTURE_QUALITY = 15
    /* Internet constants */
    val SOCKET_TIMEOUT1: Int = 80000
    val SOCKET_TIMEOUT2: Int = 5000
    val UDP_PORT: Int = 8000
    val TCP_PORT: Int = 80
    val SERVER_HOST = "192.168.65.33"
    /* */
}