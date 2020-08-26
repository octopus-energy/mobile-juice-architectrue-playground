package com.octopus.ejplayground.common.platform

import android.widget.Toast
import com.octopus.ejplayground.AndroidPlaygroundActivity
import com.octopus.ejplayground.common.SingleActivity
import javax.inject.Inject

@SingleActivity
class AnnouncerImpl@Inject constructor(
        private val androidPlaygroundActivity: AndroidPlaygroundActivity
): Announcer {

    override fun announce(text: String) {
        Toast.makeText(androidPlaygroundActivity, text, Toast.LENGTH_LONG).show()
    }
}