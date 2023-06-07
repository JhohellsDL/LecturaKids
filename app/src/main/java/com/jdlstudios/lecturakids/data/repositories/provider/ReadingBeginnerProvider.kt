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
                image = R.drawable.perro_valiente
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
                image = R.drawable.oso_aventurero
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
                image = R.drawable.mariposa_curiosa
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
                image = R.drawable.gatito_aventurero
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
                image = R.drawable.leon_y_raton
            ),
            ReadingItem(
                id = 6,
                title = "La tortuga sabia",
                reading = "Había una vez una tortuga llamada Teresa. Teresa era conocida en el bosque por su gran sabiduría. Los demás animales acudían a ella en busca de consejo. Un día, un conejito le preguntó a Teresa cómo podía ser más rápido. La tortuga respondió: 'La velocidad no es lo más importante, la constancia lo es'. Teresa le enseñó al conejito a disfrutar cada paso y a no compararse con los demás. Desde ese día, el conejito dejó de preocuparse por ser el más rápido y comenzó a disfrutar de cada salto. Teresa continuó compartiendo su sabiduría con los demás animales y todos aprendieron a valorar la importancia de la paciencia y la constancia.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la tortuga?",
                        options = listOf(
                            "Teresa",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué buscaban los demás animales en Teresa?",
                        options = listOf(
                            "Consejo",
                            "Comida",
                            "Juegos",
                            "Ropa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué le enseñó Teresa al conejito?",
                        options = listOf(
                            "Disfrutar cada paso y no compararse",
                            "Ser el más rápido",
                            "Dormir todo el día",
                            "No hacer ejercicio"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué aprendieron los demás animales de Teresa?",
                        options = listOf(
                            "Valorar la importancia de la paciencia y la constancia",
                            "Ser impacientes y perezosos",
                            "Competir entre ellos",
                            "No escuchar consejos"
                        )
                    )
                ),
                image = R.drawable.tortuga_sabia
            ),
            ReadingItem(
                id = 7,
                title = "El viaje de la abejita",
                reading = "Había una vez una abejita llamada Maya. Maya vivía en una colmena con muchas otras abejas. Un día, Maya decidió emprender un emocionante viaje fuera de la colmena para explorar el mundo. Voló entre los campos de flores, recogiendo néctar y polen. En su camino, conoció a una mariposa llamada Luna, un pájaro cantor llamado Pedro y una mariquita llamada Sofía. Juntos, vivieron aventuras y descubrieron lugares increíbles. Después de un tiempo, Maya decidió regresar a su colmena y compartir todas las historias y experiencias con sus amigas abejas. A partir de ese día, la colmena se llenó de entusiasmo y las abejas se animaron a explorar el mundo también.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la abejita?",
                        options = listOf(
                            "Maya",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Con quiénes se encontró Maya en su viaje?",
                        options = listOf(
                            "Luna, Pedro y Sofía",
                            "Luna, Pablo y Andrea",
                            "Luis, Marta y Ana",
                            "Carlos, Laura y Juan"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué recogía Maya en su viaje?",
                        options = listOf(
                            "Néctar y polen",
                            "Hojas y ramitas",
                            "Frutas y verduras",
                            "Piedras y conchas"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pasó en la colmena después del regreso de Maya?",
                        options = listOf(
                            "La colmena se llenó de entusiasmo y las abejas se animaron a explorar",
                            "La colmena se quedó en silencio",
                            "Las abejas se enojaron con Maya",
                            "Maya se fue de la colmena"
                        )
                    )
                ),
                image = R.drawable.abejita
            ),
            ReadingItem(
                id = 8,
                title = "El elefantito curioso",
                reading = "Había una vez un elefantito llamado Pablito. Pablito era muy curioso y siempre hacía preguntas sobre todo lo que veía. Un día, mientras caminaba por la selva, vio un árbol con frutas de colores. Quería saber si eran deliciosas, así que decidió probar una. ¡Era deliciosa! Pablito estaba tan emocionado que comenzó a comer más y más frutas. Pronto, se dio cuenta de que había comido demasiado y su barriga estaba llena. No podía moverse. Pero no se preocupen, llegó su amiga la jirafa Gina, quien le dio un masaje en la barriga y lo ayudó a sentirse mejor. Desde ese día, Pablito siguió siendo curioso, pero aprendió a no excederse y a pedir ayuda cuando lo necesitaba.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del elefantito?",
                        options = listOf(
                            "Pablito",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Pablito cuando vio el árbol con frutas?",
                        options = listOf(
                            "Decidió probar una",
                            "Lo ignoró",
                            "Se alejó corriendo",
                            "Llamó a su mamá"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué le pasó a Pablito después de comer muchas frutas?",
                        options = listOf(
                            "Su barriga se llenó y no podía moverse",
                            "Se convirtió en un pájaro",
                            "Se volvió invisible",
                            "Se convirtió en una planta"
                        )
                    ),
                    QuestionItem(
                        question = "¿Quién ayudó a Pablito a sentirse mejor?",
                        options = listOf(
                            "Gina, la jirafa",
                            "Pedro, el león",
                            "Sofía, la mariposa",
                            "Luna, la tortuga"
                        )
                    )
                ),
                image = R.drawable.elefantito_curioso
            ),
            ReadingItem(
                id = 9,
                title = "La aventura del osito Bruno",
                reading = "Había una vez un osito llamado Bruno que vivía en el bosque. Un día, decidió ir en una emocionante aventura. Caminó entre los árboles altos y encontró un río cristalino. Decidió nadar en el río y se divirtió mucho. Luego, vio una colina y decidió treparla. Desde la cima, pudo ver el hermoso paisaje del bosque. Bruno estaba lleno de felicidad. Después de su aventura, regresó a su cueva y se acurrucó en su cama suave. Estaba contento de haber tenido una gran aventura y estaba listo para soñar con nuevas aventuras.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del osito?",
                        options = listOf(
                            "Bruno",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Bruno en el bosque?",
                        options = listOf(
                            "Un río y una colina",
                            "Un lago y un puente",
                            "Una cueva y un arbusto",
                            "Una casa y un coche"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Bruno en el río?",
                        options = listOf(
                            "Nadó",
                            "Cantó",
                            "Saltó",
                            "Bailó"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Bruno desde la cima de la colina?",
                        options = listOf(
                            "Vio el hermoso paisaje del bosque",
                            "Se perdió",
                            "Durmó",
                            "Comió una merienda"
                        )
                    )
                ),
                image = R.drawable.osito_bruno
            ),
            ReadingItem(
                id = 10,
                title = "El viaje de la abejita Maya",
                reading = "La abejita Maya vivía en una colmena junto a sus amigas abejas. Un día, Maya decidió emprender un viaje en busca de aventuras. Voló por campos de flores coloridas y recogió néctar para hacer miel. En su camino, se encontró con una mariposa que le contó historias fascinantes sobre otros insectos. Maya estaba emocionada y quería aprender más. Finalmente, regresó a la colmena y compartió sus experiencias con las otras abejas. Todos estaban asombrados por el valiente viaje de Maya y se sintieron inspirados a explorar el mundo también.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la abejita?",
                        options = listOf(
                            "Maya",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué recogió Maya en su viaje?",
                        options = listOf(
                            "Néctar para hacer miel",
                            "Semillas para plantar",
                            "Piedras bonitas",
                            "Frutas para comer"
                        )
                    ),
                    QuestionItem(
                        question = "¿Con quién se encontró Maya en su viaje?",
                        options = listOf(
                            "Una mariposa",
                            "Un pájaro",
                            "Un conejo",
                            "Una mariquita"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron las otras abejas después de que Maya compartió sus experiencias?",
                        options = listOf(
                            "Se sintieron inspiradas a explorar el mundo también",
                            "Se quedaron en la colmena",
                            "Se durmieron",
                            "Se enojaron con Maya"
                        )
                    )
                ),
                image = R.drawable.abejita_maya
            ),
            ReadingItem(
                id = 11,
                title = "La ovejita curiosa",
                reading = "Había una ovejita llamada Lola que siempre tenía preguntas en su cabeza. Un día, decidió salir del rebaño y explorar el mundo. Encontró un río y se preguntó por qué el agua era tan fresca. Luego, vio un montón de flores de colores y se preguntó por qué tenían diferentes olores. Lola siguió haciendo preguntas y descubriendo cosas nuevas. Después de su aventura, volvió con su rebaño y compartió todo lo que había aprendido. Las otras ovejitas también se volvieron curiosas y juntas comenzaron a explorar y aprender más sobre el mundo que las rodeaba.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la ovejita?",
                        options = listOf(
                            "Lola",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Lola cerca del río?",
                        options = listOf(
                            "Agua fresca",
                            "Un pez",
                            "Una flor",
                            "Una roca"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué se preguntó Lola al ver las flores?",
                        options = listOf(
                            "Por qué tenían diferentes olores",
                            "Por qué eran tan grandes",
                            "Por qué estaban tan lejos",
                            "Por qué eran de colores"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron las otras ovejitas después de que Lola compartió sus descubrimientos?",
                        options = listOf(
                            "Se volvieron curiosas y comenzaron a explorar también",
                            "Se quedaron en el mismo lugar",
                            "Se durmieron",
                            "Se alejaron del rebaño"
                        )
                    )
                ),
                image = R.drawable.ovejita_curiosa
            ),
            ReadingItem(
                id = 12,
                title = "El conejito travieso",
                reading = "Había un conejito llamado Benito que siempre se metía en problemas. Un día, mientras exploraba el jardín, encontró una maceta llena de zanahorias. Benito pensó que sería divertido jugar con ellas, así que comenzó a saltar y hacer acrobacias. Sin querer, derribó la maceta y todas las zanahorias se cayeron. Benito se sintió mal por su travesura y decidió ayudar a su mamá a plantar nuevas zanahorias. Aprendió que es mejor divertirse de manera responsable y cuidar de las cosas que apreciamos. Desde ese día, Benito se convirtió en un conejito más responsable y cuidadoso.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del conejito?",
                        options = listOf(
                            "Benito",
                            "Luna",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Benito en el jardín?",
                        options = listOf(
                            "Una maceta llena de zanahorias",
                            "Una pelota",
                            "Un juguete roto",
                            "Una flor bonita"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Benito con las zanahorias?",
                        options = listOf(
                            "Comenzó a saltar y hacer acrobacias con ellas",
                            "Las escondió",
                            "Las comió todas",
                            "Las regaló a sus amigos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué decidió hacer Benito después de su travesura?",
                        options = listOf(
                            "Ayudar a su mamá a plantar nuevas zanahorias",
                            "Hacer más travesuras",
                            "Esconderse",
                            "Comer más zanahorias"
                        )
                    )
                ),
                image = R.drawable.conejito_travieso
            ),
            ReadingItem(
                id = 13,
                title = "El elefantito aventurero",
                reading = "Había una vez un elefantito llamado Pedro que vivía en la selva. Pedro era muy curioso y siempre buscaba aventuras emocionantes. Un día, decidió explorar el río cercano. Se metió en el agua y se divirtió chapoteando. Luego, vio una montaña alta y decidió escalarla. Desde la cima, pudo ver toda la selva y se sintió valiente. Después de sus emocionantes aventuras, Pedro regresó a su manada y les contó todo lo que había visto. Los demás elefantes se maravillaron de las hazañas de Pedro y juntos celebraron su espíritu aventurero.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del elefantito?",
                        options = listOf(
                            "Pedro",
                            "Luna",
                            "Max",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué exploró Pedro?",
                        options = listOf(
                            "El río y una montaña",
                            "El desierto y el mar",
                            "El bosque y una cueva",
                            "El jardín de flores"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué sintió Pedro desde la cima de la montaña?",
                        options = listOf(
                            "Se sintió valiente",
                            "Tuvo miedo",
                            "Se durmió",
                            "Comió una merienda"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo reaccionaron los demás elefantes cuando Pedro les contó sus aventuras?",
                        options = listOf(
                            "Se maravillaron de sus hazañas y celebraron su espíritu aventurero",
                            "Se enfadaron con él",
                            "No le prestaron atención",
                            "Lo ignoraron"
                        )
                    )
                ),
                image = R.drawable.elefantito_aventurero
            ),
            ReadingItem(
                id = 14,
                title = "La gatita aventurera",
                reading = "Había una gatita llamada Luna que vivía en una casa con su familia humana. Luna siempre tenía curiosidad por explorar el mundo exterior. Un día, escapó por la ventana y se aventuró por el vecindario. Saltó por los tejados, se escondió entre los arbustos y persiguió mariposas. Luego, encontró un árbol alto y decidió trepar hasta la cima. Desde allí, pudo ver el hermoso paisaje a su alrededor. Después de su emocionante día, Luna regresó a casa y se acurrucó junto a su familia, llena de historias que contarles.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la gatita?",
                        options = listOf(
                            "Luna",
                            "Max",
                            "Pedro",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde vivía Luna?",
                        options = listOf(
                            "En una casa con su familia humana",
                            "En la selva",
                            "En una cueva",
                            "En un jardín"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Luna al escapar por la ventana?",
                        options = listOf(
                            "Saltó por los tejados y se aventuró por el vecindario",
                            "Se escondió en su cama",
                            "Se quedó en el jardín",
                            "Comió un poco de comida"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Luna desde la cima del árbol alto?",
                        options = listOf(
                            "Pudo ver el hermoso paisaje a su alrededor",
                            "Tuvo miedo",
                            "Se durmió",
                            "Comió un pájaro"
                        )
                    )
                ),
                image = R.drawable.gatita_aventurera
            ),
            ReadingItem(
                id = 15,
                title = "La ratoncita curiosa",
                reading = "Había una ratoncita llamada Sofía que vivía en un pequeño agujero en la pared. Sofía siempre estaba llena de curiosidad y le encantaba aprender cosas nuevas. Un día, salió de su agujero y se aventuró por la casa. Descubrió un libro y comenzó a leer sobre el mundo exterior. Luego, encontró un trozo de queso en la despensa y decidió probarlo. Sofía se sorprendió por lo delicioso que era. Después de sus exploraciones, regresó a su agujero y compartió sus descubrimientos con su familia ratonil. Todos estaban emocionados por las aventuras de Sofía y juntos comenzaron a explorar más el mundo que los rodeaba.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre de la ratoncita?",
                        options = listOf(
                            "Sofía",
                            "Luna",
                            "Max",
                            "Pedro"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde vivía Sofía?",
                        options = listOf(
                            "En un agujero en la pared",
                            "En un árbol",
                            "En la playa",
                            "En un jardín"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Sofía en la despensa?",
                        options = listOf(
                            "Un trozo de queso",
                            "Un juguete",
                            "Un lápiz",
                            "Una flor"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron los otros ratoncitos después de que Sofía les contó sus descubrimientos?",
                        options = listOf(
                            "Se emocionaron y comenzaron a explorar más el mundo",
                            "Se quedaron en su agujero",
                            "Se durmieron",
                            "Se fueron a otro lugar"
                        )
                    )
                ),
                image = R.drawable.ratoncita_curiosa
            ),
            ReadingItem(
                id = 16,
                title = "El pollito aventurero",
                reading = "Había un pollito llamado Pepe que vivía en una granja. Pepe era muy curioso y siempre estaba en busca de nuevas aventuras. Un día, decidió explorar el campo. Corrió por los prados, jugó con otros animales de la granja y encontró un charco para chapotear. Después, vio un árbol alto y decidió subir a las ramas bajas. Desde allí, pudo ver todo el campo extendido. Pepe estaba emocionado y lleno de alegría. Al final del día, regresó al gallinero y se durmió, soñando con las próximas aventuras que le esperaban.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del pollito?",
                        options = listOf(
                            "Pepe",
                            "Luna",
                            "Max",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde decidió explorar Pepe?",
                        options = listOf(
                            "El campo",
                            "La playa",
                            "El bosque",
                            "El desierto"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Pepe en el charco?",
                        options = listOf(
                            "Chapotear",
                            "Correr",
                            "Saltar",
                            "Volar"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pudo ver Pepe desde las ramas bajas del árbol?",
                        options = listOf(
                            "Todo el campo extendido",
                            "Un nido de pájaros",
                            "Un gusano en el suelo",
                            "Otro pollito jugando"
                        )
                    )
                ),
                image = R.drawable.pollito_aventurero
            ),
            ReadingItem(
                id = 17,
                title = "El conejito aventurero",
                reading = "Había un conejito llamado Benito que vivía en un prado verde. Benito siempre estaba ansioso por nuevas aventuras. Un día, decidió explorar el bosque cercano. Saltó entre los árboles, jugó con otros animales y encontró un arroyo para beber agua. Después, vio una colina empinada y decidió subir. Desde la cima, pudo ver todo el bosque extendido ante él. Benito estaba emocionado y lleno de energía. Al final del día, regresó al prado y se acurrucó en su madriguera, soñando con las emocionantes aventuras que vendrían.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del conejito?",
                        options = listOf(
                            "Benito",
                            "Luna",
                            "Max",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde decidió explorar Benito?",
                        options = listOf(
                            "El bosque",
                            "La playa",
                            "El desierto",
                            "El jardín"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontró Benito en el bosque?",
                        options = listOf(
                            "Un arroyo para beber agua",
                            "Un nido de pájaros",
                            "Un hueso enterrado",
                            "Otro conejito jugando"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pudo ver Benito desde la cima de la colina empinada?",
                        options = listOf(
                            "Todo el bosque extendido ante él",
                            "Un lago",
                            "Un montón de zanahorias",
                            "Una flor bonita"
                        )
                    )
                ),
                image = R.drawable.conejito_aventurero
            ),
            ReadingItem(
                id = 18,
                title = "El viaje mágico",
                reading = "Había una vez una niña llamada Laura que encontró un mapa mágico en el desván de su casa. El mapa mostraba un camino hacia un tesoro escondido en la montaña. Laura decidió emprender el viaje y seguir el mapa. Caminó por senderos estrechos, cruzó puentes colgantes y escaló rocas. Finalmente, llegó a la cima de la montaña y encontró el tesoro brillante. Laura estaba emocionada y se sintió valiente por completar la aventura. Regresó a casa con el tesoro y compartió la historia con su familia.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Quién encontró el mapa mágico?",
                        options = listOf(
                            "Laura",
                            "Max",
                            "Sofía",
                            "Pedro"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué mostraba el mapa?",
                        options = listOf(
                            "Un camino hacia un tesoro escondido en la montaña",
                            "Un camino hacia el océano",
                            "Un camino hacia el bosque",
                            "Un camino hacia el espacio"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué tuvo que hacer Laura durante su viaje?",
                        options = listOf(
                            "Caminar por senderos estrechos, cruzar puentes colgantes y escalar rocas",
                            "Correr rápido",
                            "Nadar en un río",
                            "Volar en un avión"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Laura al completar la aventura?",
                        options = listOf(
                            "Valiente",
                            "Asustada",
                            "Aburrida",
                            "Enojada"
                        )
                    )
                ),
                image = R.drawable.viaje_magico
            ),
            ReadingItem(
                id = 19,
                title = "El misterio del castillo",
                reading = "En un pequeño pueblo, había un castillo abandonado que todos creían que estaba encantado. Un grupo de amigos llamados Carlos, Marta y Juan decidieron investigar el misterio. Entraron al castillo y exploraron las habitaciones oscuras. Encontraron puertas secretas, pasadizos ocultos y antiguos pergaminos. Mientras resolvían los enigmas, descubrieron que el castillo no estaba encantado, sino que alguien estaba tratando de asustar a la gente. Los amigos revelaron la verdad y el castillo dejó de ser un lugar temido por todos.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Quiénes decidieron investigar el misterio del castillo?",
                        options = listOf(
                            "Carlos, Marta y Juan",
                            "Luna, Max y Pedro",
                            "Sofía, Laura y Benito",
                            "Simón, Pepe y Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontraron los amigos mientras exploraban el castillo?",
                        options = listOf(
                            "Puertas secretas, pasadizos ocultos y antiguos pergaminos",
                            "Animales asustados",
                            "Juguetes antiguos",
                            "Un tesoro enterrado"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué descubrieron los amigos sobre el castillo?",
                        options = listOf(
                            "No estaba encantado, alguien estaba tratando de asustar a la gente",
                            "Estaba lleno de fantasmas",
                            "Había tesoros escondidos en todas partes",
                            "Era un lugar mágico"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué sucedió después de que los amigos revelaron la verdad?",
                        options = listOf(
                            "El castillo dejó de ser un lugar temido por todos",
                            "El castillo desapareció",
                            "El castillo se volvió aún más aterrador",
                            "Los amigos encontraron más misterios"
                        )
                    )
                ),
                image = R.drawable.misterio_del_castillo
            ),
            ReadingItem(
                id = 20,
                title = "La fiesta sorpresa",
                reading = "Era el cumpleaños de Ana y sus amigos querían hacerle una fiesta sorpresa. Decidieron organizarla en el parque y cada uno tuvo un papel importante. Pedro fue el encargado de llevar los globos, Marta preparó los juegos, Juan trajo la música y Laura hizo un delicioso pastel. Cuando Ana llegó al parque, todos saltaron y gritaron: ¡Sorpresa! Ana estaba feliz y emocionada. Disfrutaron de la fiesta juntos y Ana agradeció a sus amigos por la increíble sorpresa.",
                questions = listOf(
                    QuestionItem(
                        question = "¿De quién era el cumpleaños?",
                        options = listOf(
                            "Ana",
                            "Luna",
                            "Max",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Dónde organizaron la fiesta sorpresa?",
                        options = listOf(
                            "En el parque",
                            "En la playa",
                            "En el bosque",
                            "En el jardín"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué papel tuvo cada amigo en la fiesta sorpresa?",
                        options = listOf(
                            "Pedro llevó los globos, Marta preparó los juegos, Juan trajo la música y Laura hizo el pastel",
                            "Pedro hizo el pastel, Marta llevó los globos, Juan preparó los juegos y Laura trajo la música",
                            "Laura llevó los globos, Pedro preparó los juegos, Marta trajo la música y Juan hizo el pastel",
                            "Juan hizo el pastel, Laura llevó los globos, Pedro trajo la música y Marta preparó los juegos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Ana cuando llegó al parque y vio la fiesta sorpresa?",
                        options = listOf(
                            "Feliz y emocionada",
                            "Triste y enojada",
                            "Asustada y sorprendida",
                            "Aburrida y enojada"
                        )
                    )
                ),
                image = R.drawable.fiesta_sorpresa
            ),
            ReadingItem(
                id = 21,
                title = "El viaje en globo",
                reading = "Laura y su familia decidieron hacer un emocionante viaje en globo. Subieron al cesto del globo y despegaron lentamente. Mientras volaban, pudieron ver vistas increíbles: campos verdes, ríos serpenteantes y montañas altas. El piloto explicó cómo funcionaba el globo y les contó historias interesantes. Después de un emocionante viaje, aterrizaron suavemente en un campo abierto. Laura estaba emocionada y agradeció a su familia por la increíble experiencia en globo.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Quiénes decidieron hacer un viaje en globo?",
                        options = listOf(
                            "Laura y su familia",
                            "Max y su familia",
                            "Sofía y su familia",
                            "Pedro y su familia"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pudieron ver desde el globo?",
                        options = listOf(
                            "Campos verdes, ríos serpenteantes y montañas altas",
                            "Edificios altos, calles ocupadas y coches rápidos",
                            "Playas de arena blanca y agua azul",
                            "Bosques oscuros y misteriosos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué explicó el piloto durante el viaje?",
                        options = listOf(
                            "Cómo funcionaba el globo",
                            "Cómo conducir un coche",
                            "Cómo nadar en el mar",
                            "Cómo escalar una montaña"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Laura después del viaje en globo?",
                        options = listOf(
                            "Emocionada y agradecida",
                            "Triste y aburrida",
                            "Asustada y confundida",
                            "Enojada y molesta"
                        )
                    )
                ),
                image = R.drawable.viaje_en_globo
            ),
            ReadingItem(
                id = 22,
                title = "El granjero trabajador",
                reading = "Había un granjero llamado Carlos que trabajaba duro todos los días. Se levantaba temprano para alimentar a los animales, arar los campos y plantar semillas. Durante el día, reparaba vallas, cosechaba frutas y verduras, y cuidaba de sus animales. Carlos sabía que su trabajo era importante para que todos tuvieran comida fresca en la mesa. Al final del día, se sentía satisfecho y orgulloso de su trabajo en la granja.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cuál es el nombre del granjero?",
                        options = listOf(
                            "Carlos",
                            "Luna",
                            "Max",
                            "Sofía"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hacía Carlos todas las mañanas?",
                        options = listOf(
                            "Alimentar a los animales, arar los campos y plantar semillas",
                            "Jugar con los animales",
                            "Descansar en casa",
                            "Ver televisión"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hacía Carlos durante el día?",
                        options = listOf(
                            "Reparar vallas, cosechar frutas y verduras, y cuidar de sus animales",
                            "Ir al parque",
                            "Ir de compras",
                            "Leer libros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sentía Carlos al final del día?",
                        options = listOf(
                            "Satisfecho y orgulloso de su trabajo en la granja",
                            "Triste y cansado",
                            "Enojado y frustrado",
                            "Aburrido y desanimado"
                        )
                    ),


                    ),
                image = R.drawable.granjero_trabajador
            )
        )
    }
}