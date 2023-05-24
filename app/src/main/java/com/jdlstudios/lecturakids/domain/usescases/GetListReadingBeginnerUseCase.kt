package com.jdlstudios.lecturakids.domain.usescases

import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class GetListReadingBeginnerUseCase(
    private val readingBeginnerRepository : ReadingBeginnerProvider
) {
    operator fun invoke(): List<ReadingItem>{
        return readingBeginnerRepository.loadReadingBeginner()
    }
}