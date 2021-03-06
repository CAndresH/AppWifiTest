package com.lacour.vincent.wificaresp8266.constant

import com.lacour.vincent.wificaresp8266.model.Storage

object Constant {

    val IP_ADDRESS_ST0RAGE = Storage("ip_address", "192.168.1.3")
    val PORT_STORAGE = Storage("port", "8080")
    val PORT_STORAGEVIDEO = Storage("portvideo", "8001")
    val PORT_STORAGEAUDIO = Storage("portaudio", "8000")
    val PORT_STORAGETEMP = Storage("portaudio", "1234")

    val MOVE_FORWARD_STORAGE = Storage("move_forward", "F")
    val MOVE_BACKWARD_STORAGE = Storage("move_backward", "B")
    val MOVE_STOP_STORAGE = Storage("move_stop", "S")
    val TURN_RIGHT_STORAGE = Storage("turn_right", "R")
    val TURN_LEFT_STORAGE = Storage("turn_left", "L")

    val ACTION_1_STORAGE = Storage("action_1", "A")
    val ACTION_2_STORAGE = Storage("action_2", "X")
    val ACTION_3_STORAGE = Storage("action_3", "C")
    val ACTION_4_STORAGE = Storage("action_4", "D")
    val ACTION_5_STORAGE = Storage("action_5", "E")
    val ACTION_6_STORAGE = Storage("action_6", "k")
    val ACTION_7_STORAGE = Storage("action_7", "G")
    val ACTION_8_STORAGE = Storage("action_8", "H")

    val SPEECH_RECOGNITION_LANGUAGE_STORAGE = Storage("speech_recognition_language", "en_US")
    val KEYWORD_FORWARD_STORAGE = Storage("keyword_forward", "forward")
    val KEYWORD_BACKWARD_STORAGE = Storage("keyword_backward", "backward")
    val KEYWORD_RIGHT_STORAGE = Storage("keyword_right", "right")
    val KEYWORD_LEFT_STORAGE = Storage("keyword_left", "left")
}