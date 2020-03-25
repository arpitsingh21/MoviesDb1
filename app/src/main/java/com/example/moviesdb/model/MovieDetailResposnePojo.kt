package com.example.moviesdb.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class MovieDetailResposnePojo
{

    @SerializedName("adult")
    @Expose
    private var adult: Boolean? = null
    @SerializedName("backdrop_path")
    @Expose
    private var backdropPath: String? = null
    @SerializedName("belongs_to_collection")
    @Expose
    private var belongsToCollection: Any? = null
    @SerializedName("budget")
    @Expose
    private var budget: Int? = null
    @SerializedName("genres")
    @Expose
    private var genres: List<Genre>? = null
    @SerializedName("homepage")
    @Expose
    private var homepage: String? = null
    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("imdb_id")
    @Expose
    private var imdbId: String? = null
    @SerializedName("original_language")
    @Expose
    private var originalLanguage: String? = null
    @SerializedName("original_title")
    @Expose
    private var originalTitle: String? = null
    @SerializedName("overview")
    @Expose
    private var overview: String? = null
    @SerializedName("popularity")
    @Expose
    private var popularity: Double? = null
    @SerializedName("poster_path")
    @Expose
    private var posterPath: String? = null
    @SerializedName("production_companies")
    @Expose
    private var productionCompanies: List<ProductionCompany>? = null
    @SerializedName("production_countries")
    @Expose
    private var productionCountries: List<ProductionCompany>? = null
    @SerializedName("release_date")
    @Expose
    private var releaseDate: String? = null
    @SerializedName("revenue")
    @Expose
    private var revenue: Int? = null
    @SerializedName("runtime")
    @Expose
    private var runtime: Int? = null
    @SerializedName("spoken_languages")
    @Expose
    private var spokenLanguages: List<SpokenLanguage>? = null
    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("tagline")
    @Expose
    private var tagline: String? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("video")
    @Expose
    private var video: Boolean? = null
    @SerializedName("vote_average")
    @Expose
    private var voteAverage: Double? = null
    @SerializedName("vote_count")
    @Expose
    private var voteCount: Int? = null

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

    fun getBelongsToCollection(): Any? {
        return belongsToCollection
    }

    fun setBelongsToCollection(belongsToCollection: Any) {
        this.belongsToCollection = belongsToCollection
    }

    fun getBudget(): Int? {
        return budget
    }

    fun setBudget(budget: Int?) {
        this.budget = budget
    }

    fun getGenres(): List<Genre>? {
        return genres
    }

    fun setGenres(genres: List<Genre>) {
        this.genres = genres
    }

    fun getHomepage(): String? {
        return homepage
    }

    fun setHomepage(homepage: String) {
        this.homepage = homepage
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getImdbId(): String? {
        return imdbId
    }

    fun setImdbId(imdbId: String) {
        this.imdbId = imdbId
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

    fun getOverview(): String? {
        return overview
    }

    fun setOverview(overview: String) {
        this.overview = overview
    }

    fun getPopularity(): Double? {
        return popularity
    }

    fun setPopularity(popularity: Double?) {
        this.popularity = popularity
    }

    fun getPosterPath(): String? {
        return posterPath
    }

    fun setPosterPath(posterPath: String) {
        this.posterPath = posterPath
    }

    fun getProductionCompanies(): List<ProductionCompany>? {
        return productionCompanies
    }

    fun setProductionCompanies(productionCompanies: List<ProductionCompany>) {
        this.productionCompanies = productionCompanies
    }

    fun getProductionCountries(): List<ProductionCompany>? {
        return productionCountries
    }

    fun setProductionCountries(productionCountries: List<ProductionCompany>) {
        this.productionCountries = productionCountries
    }

    fun getReleaseDate(): String? {
        return releaseDate
    }

    fun setReleaseDate(releaseDate: String) {
        this.releaseDate = releaseDate
    }

    fun getRevenue(): Int? {
        return revenue
    }

    fun setRevenue(revenue: Int?) {
        this.revenue = revenue
    }

    fun getRuntime(): Int? {
        return runtime
    }

    fun setRuntime(runtime: Int?) {
        this.runtime = runtime
    }

    fun getSpokenLanguages(): List<SpokenLanguage>? {
        return spokenLanguages
    }

    fun setSpokenLanguages(spokenLanguages: List<SpokenLanguage>) {
        this.spokenLanguages = spokenLanguages
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getTagline(): String? {
        return tagline
    }

    fun setTagline(tagline: String) {
        this.tagline = tagline
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getVideo(): Boolean? {
        return video
    }

    fun setVideo(video: Boolean?) {
        this.video = video
    }

    fun getVoteAverage(): Double? {
        return voteAverage
    }

    fun setVoteAverage(voteAverage: Double?) {
        this.voteAverage = voteAverage
    }

    fun getVoteCount(): Int? {
        return voteCount
    }

    fun setVoteCount(voteCount: Int?) {
        this.voteCount = voteCount
    }


}