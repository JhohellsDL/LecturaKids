package com.jdlstudios.lecturakids.domain.usescases

import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class GetListReadingIntermediateUseCase(
    private val readingIntermediateProvider: ReadingIntermediateProvider
) {
    operator fun invoke(): List<ReadingItem>{
        return readingIntermediateProvider.loadReadingIntermediate()
    }
}