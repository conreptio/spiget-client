/*
 * This file is part of Material.
 *
 * Copyright (c) 2016-2017 Neolumia
 *
 * Material is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Material is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Material. If not, see <http://www.gnu.org/licenses/>.
 */

package com.neolumia.spiget;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Version {

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("releaseDate")
  @Expose
  private Long releaseDate;

  @SerializedName("downloads")
  @Expose
  private Integer downloads;

  @SerializedName("rating")
  @Expose
  private Rating rating;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Integer getDownloads() {
    return downloads;
  }

  public void setDownloads(Integer downloads) {
    this.downloads = downloads;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }
}
