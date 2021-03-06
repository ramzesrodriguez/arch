package io.github.msh91.arch.domain.usecase.movie

import io.github.msh91.arch.domain.mapper.DomainErrorUtil
import io.github.msh91.arch.domain.model.movie.Movie
import io.github.msh91.arch.domain.repository.MovieRepository
import io.github.msh91.arch.domain.usecase.base.FlowableUseCase
import io.reactivex.Flowable
import javax.inject.Inject

class GetAllMoviesUseCase @Inject constructor(
        errorUtil: DomainErrorUtil,
        private val movieRepository: MovieRepository
) : FlowableUseCase<List<Movie>>(errorUtil) {

    override fun execute(): Flowable<List<Movie>> {
        return movieRepository.getAllMovies()
    }
}