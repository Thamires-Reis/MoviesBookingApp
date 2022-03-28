package models

class MoviesCatalog (

    var title: String,

    var description: String,

    var image: String,

    var time: String


    ) {

        override fun toString(): String {
            return "MovieList(title='$title', image='$image', starring='$description'  time='$time')"
        }


    }


