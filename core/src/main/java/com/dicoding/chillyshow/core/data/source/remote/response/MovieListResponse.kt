package com.dicoding.chillyshow.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieListResponse(

	@field:SerializedName("results")
	val results: List<MovieDetailResponse>
)

data class MovieDetailResponse(

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("poster_path")
	val posterPath: String
)
