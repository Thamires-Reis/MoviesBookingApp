package com.example.moviesbookingrecyclerview


import models.MoviesCatalog


class DataSource{

    companion object {

        fun createDataSet(): ArrayList<MoviesCatalog> {
            val list = ArrayList<MoviesCatalog>()
            list.add(
                MoviesCatalog(
                    "THE BATMAN!",
                    "From Warner Bros. Pictures comes \"The Batman,\" with director Matt Reeves (the \"Planet of the Apes\" films) at the helm and with Robert Pattinson (\"Tenet,\" \"The Lighthouse,\" \"Good Time\") starring as Gotham City's vigilante detective, Batman.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid20479.jpg",
                    "Running time: 2hrs 55mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "SONIC THE HEDGEHOG 2",
                    "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid21362.jpg?sc=.99",
                    "Running time: 2h 2mins"
                )
            )

            list.add(
                MoviesCatalog(
                    "FANTASTIC BEASTS: THE SECRETS OF DUMBLEDORE",
                    "Unable to stop the powerful Dark wizard Gellert Grindelwald alone, Professor Albus Dumbledore entrusts Magizoologist Newt Scamander to lead an intrepid team of wizards, witches and one brave Muggle baker on a dangerous mission.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid21365.jpg?sc=.99",
                    "Running time: 2hrs 22mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "SPIDER-MAN: NO WAY HOME",
                    "For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid21113.jpg?sc=.99",
                    "Running time: 2hrs 28mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "THE BAD GUYS",
                    "In the new action comedy from DreamWorks Animation, based on the New York Times best-selling book series, a crackerjack criminal crew of animal outlaws are about to attempt their most challenging con yet - becoming model citizens.",
                    "https://www.myvue.com/-/media/5cf51ba6c386450d9e89f44c24cfb134.png?w=200",
                    "Running time: 1hr 40mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "MORBIUS",
                    "One of Marvel's most compelling and conflicted characters comes to the big screen as Oscar winner Jared Leto transforms into the enigmatic antihero, Michael Morbius",
                    "https://images.mymovies.net/images/film/cin/350x522/fid20116.jpg",
                    "Running time: 1hr 48mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "AMBULANCE",
                    "Over one day across the streets of L.A., three lives will change forever.",
                    "https://www.myvue.com/-/media/be51d11d352945438e34d33e0ed8ea9d.png?w=200",
                    "Running time: 2hrs 16mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "UNCHARTED",
                    "Street-smart Nathan Drake (Tom Holland) is recruited by seasoned treasure hunter Victor \"Sully\" Sullivan (Mark Wahlberg) to recover a fortune amassed by Ferdinand Magellan and lost 500 years ago by the House of Moncada.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid20296.jpg?sc=.99",
                    "Running time: 1hr 56mins"
                )
            )
            list.add(
                MoviesCatalog(
                    "DOG",
                    "Army Ranger Briggs (Channing Tatum) and Lulu (a Belgian Malinois dog) buckle into a 1984 Ford Bronco and race down the Pacific Coast in hopes of making it to a fellow soldier's funeral on time.",
                    "https://images.mymovies.net/images/film/cin/350x522/fid21333.jpg?sc=.99",
                    "Running time: 1hr 41mins"
                )
            )
            return list
        }
    }
}


