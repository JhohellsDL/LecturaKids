package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingBeginnerProvider {

    fun loadReadingBeginner(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "El perro valiente",
                reading = "Había una vez un perro llamado Max. Max era un perro muy valiente que vivía en una casa junto a un parque. Siempre estaba dispuesto a proteger a su familia y a los demás animales. Un día, mientras paseaba por el parque, escuchó un ladrido de ayuda. Siguió el sonido y encontró a un gatito atrapado en un árbol. Sin dudarlo, Max comenzó a ladrar para alertar a todos. Pronto, varios vecinos vinieron a ayudar y rescataron al gatito. El gatito estaba asustado, pero Max lo consoló y se convirtieron en amigos inseparables. Desde ese día, Max siguió siendo el perro valiente del parque, cuidando y protegiendo a todos los animales que lo rodeaban.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del perro?",
                        options = listOf(
                            "Max",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde vivía Max?",
                        options = listOf(
                            "Junto a un parque",
                            "En la playa",
                            "En la ciudad",
                            "En la montaña"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Max en el árbol?",
                        options = listOf(
                            "Un gatito atrapado",
                            "Un pájaro",
                            "Una pelota",
                            "Un juguete"
                        )
                    ),
                    QuestionItem(
                        question = "¿Quién ayudó a rescatar al gatito?",
                        options = listOf(
                            "Varios vecinos",
                            "Pedro",
                            "Sofía",
                            "Miguel"
                        )
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 2,
                title = "El osito aventurero",
                reading = "Había una vez un osito llamado Benito. Benito vivía en un bosque encantado lleno de árboles altos y ríos cristalinos. A diferencia de otros ositos que preferían quedarse cerca de la cueva, Benito era muy aventurero. Un día, decidió explorar más allá de los límites del bosque. Caminó por prados verdes y escaló montañas nevadas. En su viaje, conoció a muchos animales diferentes y descubrió lugares hermosos. Sin embargo, al caer la tarde, Benito se dio cuenta de que se había perdido. Estaba preocupado, pero luego escuchó un rugido amistoso. Era su amiga la osa Bella, que lo había estado siguiendo. Juntos, encontraron el camino de regreso a casa. Desde ese día, Benito siguió siendo aventurero, pero siempre se aseguraba de tener a Bella a su lado.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo se llama el osito?",
                        options = listOf(
                            "Benito",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde vivía Benito?",
                        options = listOf(
                            "En un bosque encantado",
                            "En la playa",
                            "En la ciudad",
                            "En la montaña"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Benito en su aventura?",
                        options = listOf(
                            "Animales diferentes y lugares hermosos",
                            "Juguetes",
                            "Comida",
                            "Libros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Quién ayudó a Benito a regresar a casa?",
                        options = listOf(
                            "Bella",
                            "Pedro",
                            "Sofía",
                            "Miguel"
                        )
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 3,
                title = "La mariposa curiosa",
                reading = "Había una vez una mariposa llamada Margarita. Margarita vivía en un hermoso jardín lleno de flores de todos los colores. Un día, mientras volaba de flor en flor, vio algo brillante en el otro extremo del jardín. Era un arcoíris. La curiosidad invadió a Margarita y decidió volar hacia él. A medida que se acercaba, el arcoíris parecía alejarse más. Margarita continuó persiguiéndolo, pero cuanto más volaba, más lejos parecía estar. Al final, Margarita se dio cuenta de que el arcoíris era solo una ilusión. Aunque no pudo alcanzarlo, Margarita aprendió a apreciar la belleza de las pequeñas cosas que la rodeaban en su jardín.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la mariposa?",
                        options = listOf(
                            "Margarita",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué vio Margarita en el otro extremo del jardín?",
                        options = listOf(
                            "Un arcoíris",
                            "Un pájaro",
                            "Una nube",
                            "Una estrella"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué sucedió cuando Margarita intentó acercarse al arcoíris?",
                        options = listOf(
                            "El arcoíris parecía alejarse más",
                            "El arcoíris desapareció",
                            "El arcoíris se hizo más grande",
                            "El arcoíris se volvió rosa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué aprendió Margarita al final?",
                        options = listOf(
                            "Apreciar la belleza de las pequeñas cosas",
                            "Nunca perseguir arcoíris",
                            "Volar más rápido",
                            "Olvidar su jardín"
                        )
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 4,
                title = "El gatito aventurero",
                reading = "Había una vez un gatito llamado Tomás. Tomás vivía en una pequeña casa junto a una granja. Todos los días, Tomás veía a los otros animales de la granja salir a explorar el mundo y quería hacer lo mismo. Un día, decidió aventurarse más allá de los límites de la granja y explorar el bosque cercano. Tomás caminó entre los árboles altos y se encontró con muchos animales diferentes. Vio conejos saltando, pájaros volando y ardillas correteando. Estaba tan emocionado que siguió explorando hasta que se dio cuenta de que se había perdido. ¡No sabía cómo volver a casa! Pero entonces, escuchó un maullido familiar. Era su amiga gata, Luna, que había seguido su rastro. Luna guió a Tomás de regreso a casa y desde ese día, Tomás fue más cauteloso en sus aventuras, pero siempre agradecido por la valiosa amistad de Luna.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo se llama el gatito?",
                        options = listOf(
                            "Tomás",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde vivía Tomás?",
                        options = listOf(
                            "Junto a una granja",
                            "En el bosque",
                            "En la ciudad",
                            "En la playa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Tomás en el bosque?",
                        options = listOf(
                            "Animales diferentes",
                            "Juguetes",
                            "Comida",
                            "Libros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Quién ayudó a Tomás a regresar a casa?",
                        options = listOf(
                            "Luna",
                            "Pedro",
                            "Sofía",
                            "Miguel"
                        )
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 5,
                title = "El león y el ratón",
                reading = "Un día, un león dormía tranquilamente en la selva cuando un ratón empezó a jugar encima de él. El león se despertó y atrapó al ratón entre sus garras. El ratón le rogó que lo perdonara y le prometió que algún día le devolvería el favor. El león se rió de la idea de que un ratón pudiera ayudarlo y lo dejó ir. Tiempo después, el león cayó en una trampa de unos cazadores. Estaba atado con una red muy fuerte y no podía escapar. Rugió con fuerza, esperando que algún otro animal lo oyera y lo ayudara. El ratón escuchó el rugido y corrió hacia el lugar donde estaba el león. Reconoció al león que le había perdonado la vida y decidió devolverle el favor. Con sus dientes afilados, empezó a roer la red hasta que logró hacer un agujero por donde el león pudo salir. El león agradeció al ratón su ayuda y reconoció que se había equivocado al pensar que un ratón no podía ayudar a un león.",
                questions = listOf(
                    QuestionItem(
                        question = "¿ Qué hizo el ratón cuando el león dormía?",
                        options = listOf(
                            " Lo despertó con sus juegos ",
                            " Lo mordió en la cola ",
                            " Le trajo comida ",
                            " Le cantó una canción"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué le prometió el ratón al león si lo dejaba ir?",
                        options = listOf(
                            "Que le devolvería el favor",
                            "Que le traería un queso",
                            "Que le enseñaría a cazar",
                            "Que le presentaría a sus amigos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo cayó el león en la trampa de los cazadores?",
                        options = listOf(
                            "Se enredó en una red",
                            "Se clavó una flecha",
                            "Se metió en una jaula",
                            "Se resbaló en un pozo"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo ayudó el ratón al león a escapar de la trampa?",
                        options = listOf(
                            "Roe la red con sus dientes",
                            "Rugió para asustar a los cazadores",
                            "Le dio ánimos con sus palabras",
                            "Le hizo cosquillas para que se riera"
                        )
                    )
                ),
                image = R.drawable.libro_de_lectura
            )
        )
    }
}