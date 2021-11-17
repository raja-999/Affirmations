package raja.bey.affirmations.data

import raja.bey.affirmations.R


import raja.bey.affirmations.model.affirmations


class Datasource {

    fun loadAffirmations(): List<affirmations> {
        return listOf<affirmations>(
            affirmations(R.string.affirmation1),
            affirmations(R.string.affirmation2),
            affirmations(R.string.affirmation3),
            affirmations(R.string.affirmation4),
            affirmations(R.string.affirmation5),
            affirmations(R.string.affirmation6),
            affirmations(R.string.affirmation7),
            affirmations(R.string.affirmation8),
            affirmations(R.string.affirmation9),
            affirmations(R.string.affirmation10)
        )
    }
}