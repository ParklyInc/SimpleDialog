/*
 *  Copyright 2017 Philipp Niedermayer (github.com/eltos)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package parkly.simpledialogfragments;


import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import parkly.simpledialogfragment.color.SimpleColorDialog;

/**
 * Wrapper class to use the contents of a dialog as a normal ("flat") fragment
 * somewhere in an activity
 *
 */
public class FlatColorFragment extends SimpleColorDialog {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return extractContentView(savedInstanceState);
    }

    public boolean callResultListener() {
        return super.callResultListener(BUTTON_POSITIVE, null);
    }
}
