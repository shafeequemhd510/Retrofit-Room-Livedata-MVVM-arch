package com.example.recipeapp.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "recipes")
public class Recipe  {
    @PrimaryKey
    @NonNull
    private String recipe_id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "publisher")
    private String publisher;
    @ColumnInfo(name = "ingredients")
    private String[] ingredients;
    @ColumnInfo(name = "image_url")
    private String image_url;
    @ColumnInfo(name = "social_rank")
    private float social_rank;
    @ColumnInfo(name = "timestamp")
    private int timestamp;


    public Recipe(@NonNull String recipe_id, String title, String publisher, String[] ingredients, String image_url, float social_rank, int timestamp) {
        this.recipe_id = recipe_id;
        this.title = title;
        this.publisher = publisher;
        this.ingredients = ingredients;
        this.image_url = image_url;
        this.social_rank = social_rank;
        this.timestamp = timestamp;
    }

  /*  public Recipe() {
    }


    protected Recipe(Parcel in) {
        recipe_id = in.readString();
        title = in.readString();
        publisher = in.readString();
        ingredients = in.createStringArray();
        image_url = in.readString();
        social_rank = in.readFloat();
        timestamp = in.readInt();
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(recipe_id);
        dest.writeString(title);
        dest.writeString(publisher);
        dest.writeStringArray(ingredients);
        dest.writeString(image_url);
        dest.writeFloat(social_rank);
        dest.writeInt(timestamp);
    }
*/
    @NonNull
    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(@NonNull String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getSocial_rank() {
        return social_rank;
    }

    public void setSocial_rank(float social_rank) {
        this.social_rank = social_rank;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

  /*  @Override
    public String toString() {
        return "Recipe{" +
                "recipe_id='" + recipe_id + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", image_url='" + image_url + '\'' +
                ", social_rank=" + social_rank +
                ", timestamp=" + timestamp +
                '}';
    }*/
}
