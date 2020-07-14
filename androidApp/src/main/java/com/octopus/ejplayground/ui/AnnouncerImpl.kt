package com.octopus.ejplayground.ui

import android.widget.Toast
import com.octopus.ejplayground.SingleActivity
import com.octopus.ejplayground.domain.Announcer
import javax.inject.Inject

@SingleActivity
class AnnouncerImpl@Inject constructor(
        private val androidPlaygroundActivity: AndroidPlaygroundActivity
): Announcer {

    override fun announce(text: String) {
        Toast.makeText(androidPlaygroundActivity, text, Toast.LENGTH_LONG).show()
    }
}