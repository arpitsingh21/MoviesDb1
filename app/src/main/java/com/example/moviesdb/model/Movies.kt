package com.example.moviesdb.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Movies {
    @SerializedName("popularity")
    @Expose
    private var popularity: Double? = null
    @SerializedName("vote_count")
    @Expose
    private var voteCount: Int? = null
    @SerializedName("video")
    @Expose
    private var video: Boolean? = null
    @SerializedName("poster_path")
    @Expose
    private var posterPath: String? = null
    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("adult")
    @Expose
    private var adult: Boolean? = null
    @SerializedName("backdrop_path")
    @Expose
    private var backdropPath: String? = null
    @SerializedName("original_language")
    @Expose
    private var originalLanguage: String? = null
    @SerializedName("original_title")
    @Expose
    private var originalTitle: String? = null
    @SerializedName("genre_ids")
    @Expose
    private var genreIds: List<Int>? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("vote_average")
    @Expose
    private var voteAverage: Double? = null
    @SerializedName("overview")
    @Expose
    private var overview: String? = null
    @SerializedName("release_date")
    @Expose
    private var releaseDate: String? = null

    fun getPopularity(): Double? {
        return popularity
    }

    fun setPopularity(popularity: Double?) {
        this.popularity = popularity
    }

    fun getVoteCount(): Int? {
        return voteCount
    }

    fun setVoteCount(voteCount: Int?) {
        this.voteCount = voteCount
    }

    fun getVideo(): Boolean? {
        return video
    }

    fun setVideo(video: Boolean?) {
        this.video = video
    }

    fun getPosterPath(): String? {
        return posterPath
    }

    fun setPosterPath(posterPath: String) {
        this.posterPath = posterPath
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getAdult(): Boolean? {
        return adult
    }

    fun setAdult(adult: Boolean?) {
        this.adult = adult
    }

    fun getBackdropPath(): String? {
        return backdropPath
    }

    fun setBackdropPath(backdropPath: String) {
        this.backdropPath = backdropPath
    }

    fun getOriginalLanguage(): String? {
        return originalLanguage
    }

    fun setOriginalLanguage(originalLanguage: String) {
        this.originalLanguage = originalLanguage
    }

    fun getOriginalTitle(): String? {
        return originalTitle
    }

    fun setOriginalTitle(originalTitle: String) {
        this.originalTitle = originalTitle
    }

    fun getGenreIds(): List<Int>? {
        return genreIds
    }

    fun setGenreIds(genreIds: List<Int>) {
        this.genreIds = genreIds
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getVoteAverage(): Double? {
        return voteAverage
    }

    fun setVoteAverage(voteAverage: Double?) {
        this.voteAverage = voteAverage
    }

    fun getOverview(): String? {
        return overview
    }

    fun setOverview(overview: String) {
        this.overview = overview
    }

    fun getReleaseDate(): String? {
        return releaseDate
    }

    fun setReleaseDate(releaseDate: String) {
        this.releaseDate = releaseDate
    }
}