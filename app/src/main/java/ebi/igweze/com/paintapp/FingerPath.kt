package ebi.igweze.com.paintapp

import android.graphics.Path


data class FingerPath(val color: Int,
                      val emboss: Boolean,
                      val blur: Boolean,
                      val strokeWidth: Int,
                      val path: Path)