package com.octopus.ejplayground

import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.octopus.ejplayground.common.ui.MotherAppCompatActivity
import com.octopus.ejplayground.common.viewmodels.LifecycleReceiver
import com.octopus.ejplayground.githubrepositories.MainViewModel
import com.octopus.ejplayground.theme.EjPlaygroundTheme
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

class AndroidPlaygroundActivity : MotherAppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun getLifecycleReceivers(): List<LifecycleReceiver> {
        return emptyList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                LoadingScreenContainer(
                    mainViewModel = mainViewModel,
                    onButtonClicked = { mainViewModel.onAction(MainViewModel.UiAction.LoadReposClicked) }
                )
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    EjPlaygroundTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}

@Composable
fun LoadingScreenContainer(
    mainViewModel: MainViewModel,
    onButtonClicked: () -> Unit
) {
    val state = mainViewModel.viewStateStream().collectAsState(mainViewModel.defaultViewState())
    if (!state.value.loadingIsVisible) {
        LoadingScreen(onButtonClicked = onButtonClicked)
    } else {
        Text("Loading")
    }
}

@Composable
fun LoadingScreen(
    onButtonClicked: () -> Unit
) {
    Column {
        Text(text = "Click the Button!")
        Button(onClick = onButtonClicked) {
            Text("Load Repos")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EjPlaygroundTheme {
        LoadingScreen({})
    }
}

@Preview(showBackground = false)
@Composable
fun AlternatePreview() {
    EjPlaygroundTheme {
        LoadingScreen({})
    }
}