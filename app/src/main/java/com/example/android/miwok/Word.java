package com.example.android.miwok;

public class Word {
        /** Default translation for the word */
            private String mDefaultTranslation;

            /** Miwok translation for the word */
            private String mMiwokTranslation;

            private int mAudioResorceId;

            private int mImageResoureceID = NO_IMAGE_PROVIDED;

            private static final int NO_IMAGE_PROVIDED = -1;

            /**
      * Create a new Word object.
      *
      * @param defaultTranslation is the word in a language that the user is already familiar with
      *                           (such as English)
      * @param miwokTranslation is the word in the Miwok language
      */
            public Word(String defaultTranslation, String miwokTranslation, int imageResourceID,int audioResourceId) {
                mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;
                mImageResoureceID = imageResourceID;
                mAudioResorceId = audioResourceId;
            }
             public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
                mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;
                mAudioResorceId = audioResourceId;
            }
            /**
      * Get the default translation of the word.
      */
            public String getDefaultTranslation() {
                return mDefaultTranslation;
            }

            /**
      * Get the Miwok translation of the word.
      */
            public String getMiwokTranslation() {
                return mMiwokTranslation;
            }

            public int getImageResourceID(){
                return mImageResoureceID;
            }

    /**
     * Returns whether or not there is an image for this word.
     * @return
     */
            public boolean hasImage(){
                return mImageResoureceID != NO_IMAGE_PROVIDED;
            }

    /**
     * Return audio resource id of the word
     * @return
     */
            public int getmAudioResorceId(){return mAudioResorceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResorceId=" + mAudioResorceId +
                ", mImageResoureceID=" + mImageResoureceID +
                '}';
    }
}
