package com.github.isuperred.title;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.leanback.widget.Presenter;

import com.github.isuperred.R;

/**
 * Copyright  : 2015-2033 Beijing Startimes Communication & Network Technology Co.Ltd
 * Created by（dongch） on 2019/9/18.
 * ClassName  :
 * Description  :
 */
public class TitlePresenter extends Presenter {
    private static final String TAG = "TitlePresenter";

    @Override
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_title, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        if (item instanceof Title.DataBean) {
            ViewHolder vh = (ViewHolder) viewHolder;
            vh.mTvMainTitle.setText(((Title.DataBean) item).getName());
        }

    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {

    }

    public static class ViewHolder extends Presenter.ViewHolder {

        private TextView mTvMainTitle;

        ViewHolder(View view) {
            super(view);
            mTvMainTitle = view.findViewById(R.id.tv_main_title);
        }
    }
}
