package com.elton.app.repositories.domain

import com.elton.app.repositories.core.UseCase
import com.elton.app.repositories.data.model.Repo
import com.elton.app.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}