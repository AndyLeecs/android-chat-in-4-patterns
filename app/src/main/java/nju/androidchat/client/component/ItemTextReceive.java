package nju.androidchat.client.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;

import nju.androidchat.client.R;

public class ItemTextReceive extends LinearLayout {
    @StyleableRes
    int index0 = 0;

    private TextView textView;

    public ItemTextReceive(Context context) {
        super(context);
        init(context);

    }

    public ItemTextReceive(Context context, String text) {
        this(context);
        setText(text);
    }

    public void init(Context context) {
        inflate(context, R.layout.item_text_receive, this);
        this.textView = findViewById(R.id.chat_item_content_text);
    }

    public ItemTextReceive(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        init(context);

        int[] sets = {R.attr.received_text};
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, sets);

        CharSequence text = typedArray.getText(index0);
        typedArray.recycle();


        setText(text.toString());

    }

    public String getText() {
        return textView.getText().toString();
    }

    public void setText(String text) {
        textView.setText(text);
    }

}
