package raja.bey.affirmations.data

import raja.bey.affirmations.R
import raja.bey.affirmations.model.affirmations

class Datasource() {

    fun loadAffirmations(): List<affirmations> {
        return listOf<affirmations>(
            affirmations(R.string.affirmation1, R.drawable.image1),
            affirmations(R.string.affirmation2, R.drawable.image2),
            affirmations(R.string.affirmation3, R.drawable.image3),
            affirmations(R.string.affirmation4, R.drawable.image4),
            affirmations(R.string.affirmation5, R.drawable.image5),
            affirmations(R.string.affirmation6, R.drawable.image6),
            affirmations(R.string.affirmation7, R.drawable.image7),
            affirmations(R.string.affirmation8, R.drawable.image8),
            affirmations(R.string.affirmation9, R.drawable.image9),
            affirmations(R.string.affirmation10, R.drawable.image10)
        )
    }
}