package com.jdlstudios.lecturakids.domain.usescases

import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class GetReadingUseCase(
    private val readingBeginnerRepository : ReadingBeginnerProvider,
    private val readingIntermediateRepository : ReadingIntermediateProvider,
    private val readingAdvancedRepository : ReadingAdvancedProvider
) {

    operator fun invoke(level: Int, id: Int): ReadingItem{
        var reading = ReadingItem()
        when(level){
            1 -> reading = readingBeginnerRepository.loadReadingBeginner()[id]
            2 -> reading = readingIntermediateRepository.loadReadingIntermediate()[id]
            3 -> reading = readingAdvancedRepository.loadReadingAdvanced()[id]
        }
        return reading
    }

}