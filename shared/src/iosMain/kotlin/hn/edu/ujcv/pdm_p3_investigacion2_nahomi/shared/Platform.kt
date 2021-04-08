package hn.edu.ujcv.pdm_p3_investigacion2_nahomi.shared


import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}