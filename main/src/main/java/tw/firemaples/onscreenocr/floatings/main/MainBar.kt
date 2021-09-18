package tw.firemaples.onscreenocr.floatings.main

import android.content.Context
import android.view.View
import android.widget.TextView
import tw.firemaples.onscreenocr.R
import tw.firemaples.onscreenocr.floatings.base.MovableFloatingView
import tw.firemaples.onscreenocr.floatings.translationSelectPanel.TranslationSelectPanel

class MainBar(context: Context) : MovableFloatingView(context) {
    override val layoutId: Int
        get() = R.layout.floating_main_bar

    override val moveToEdgeAfterMoved: Boolean
        get() = true

    override val fadeOutAfterMoved: Boolean
        get() = true

    private val btLangSelector: View = rootView.findViewById(R.id.bt_langSelector)
    private val tvLang: TextView = rootView.findViewById(R.id.tv_lang)
    private val ivGoogleTranslator: View = rootView.findViewById(R.id.iv_googleTranslator)
    private val btSelect: View = rootView.findViewById(R.id.bt_select)

    //    private val btOCROnly: View = rootView.findViewById(R.id.bt_ocrOnly)
    private val btClose: View = rootView.findViewById(R.id.bt_close)
    private val btMenu: View = rootView.findViewById(R.id.bt_menu)

    init {
        setViews()
        setDragView(btMenu)
    }

    private fun setViews() {
        tvLang.text = "En>"
        ivGoogleTranslator.visibility = View.VISIBLE

        btSelect.visibility = View.VISIBLE

        btLangSelector.setOnClickListener {
            TranslationSelectPanel(context).attachToScreen()
        }

//        btOCROnly.visibility = View.VISIBLE
//        btClose.visibility = View.VISIBLE
    }
}
