package hn.edu.ujcv.pdm_p3_investigacion2_nahomi.shared

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}