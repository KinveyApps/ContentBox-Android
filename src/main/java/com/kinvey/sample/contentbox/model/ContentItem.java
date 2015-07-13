/*
 * Copyright (c) 2014, Kinvey, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.kinvey.sample.contentbox.model;

import android.graphics.Bitmap;
import com.google.api.client.util.Key;
import com.kinvey.android.Client;
import com.kinvey.java.LinkedResources.LinkedGenericJson;
import com.kinvey.sample.contentbox.ContentListAdapter;
import com.kinvey.sample.contentbox.SourceFactory;

import java.util.ArrayList;

/**
 * @author edwardf
 */
public class ContentItem extends LinkedGenericJson {

    @Key
    private String name;

    @Key
    private String blurb;

    @Key
    private SourceType source;

    @Key
    private ArrayList<String> target;

    @Key
    private SourceType thumbnail;

    @Key
    private ArrayList<String> groups;

    @Key
    private String type;

    private Bitmap thumbnailImage;
    public static final String attachmentName = "kinvey_attachment";


    public ContentItem(){
        putFile(attachmentName);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public ArrayList<String> getTarget() {
        return target;
    }

    public void setTarget(ArrayList<String> target) {
        this.target = target;
    }

    public Bitmap getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(Bitmap thumb){
        this.thumbnailImage = thumb;
    }

    public void loadThumbnail(Client client, ContentListAdapter adapter){
        //new loadThumbnailTask().execute(adapter);
        new SourceFactory().asyncLoadThumbnail(client, this, adapter);


    }

    public SourceType getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(SourceType thumbnail) {
        this.thumbnail = thumbnail;
    }

    public SourceType getSource() {
        return source;
    }

    public void setSource(SourceType source) {
        this.source = source;
    }



    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public ArrayList<String> getGroups(){
        return groups;
    }

    public void setGroups(ArrayList<String> groups){
        this.groups = groups;
    }


}
