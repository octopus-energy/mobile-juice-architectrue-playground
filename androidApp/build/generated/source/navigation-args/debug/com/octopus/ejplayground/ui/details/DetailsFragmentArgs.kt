package com.octopus.ejplayground.ui.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.octopus.ejplayground.services.GithubRepoEntity
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailsFragmentArgs(
  val repository: GithubRepoEntity
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(GithubRepoEntity::class.java)) {
      result.putParcelable("repository", this.repository as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(GithubRepoEntity::class.java)) {
      result.putSerializable("repository", this.repository as Serializable)
    } else {
      throw UnsupportedOperationException(GithubRepoEntity::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __repository : GithubRepoEntity?
      if (bundle.containsKey("repository")) {
        if (Parcelable::class.java.isAssignableFrom(GithubRepoEntity::class.java) ||
            Serializable::class.java.isAssignableFrom(GithubRepoEntity::class.java)) {
          __repository = bundle.get("repository") as GithubRepoEntity?
        } else {
          throw UnsupportedOperationException(GithubRepoEntity::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__repository == null) {
          throw IllegalArgumentException("Argument \"repository\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"repository\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__repository)
    }
  }
}
