package com.jdlstudios.lecturakids.domain.usescases

import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class GetListReadingAdvancedUseCase(
    private val readingAdvancedProvider: ReadingAdvancedProvider
) {
    operator fun invoke(): List<ReadingItem>{
        return readingAdvancedProvider.loadReadingAdvanced()
    }
}