package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingIntermediateProvider {
    fun loadReadingIntermediate(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "El viaje a la montaña",
                reading = "Juan y su familia decidieron hacer un emocionante viaje a la montaña. Empacaron sus mochilas con comida y ropa caliente. Durante el camino, observaron hermosos paisajes y respiraron aire fresco. Llegaron al campamento base y comenzaron a caminar por senderos empinados. Después de horas de caminata, alcanzaron la cima de la montaña y disfrutaron de una vista espectacular. Juan se sintió orgulloso de su logro y agradeció a su familia por el increíble viaje.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Quién decidió hacer un viaje a la montaña?",
                        options = listOf(
                            "Juan y su familia",
                            "Luis y su familia",
                            "Ana y su familia",
                            "Sofía y su familia"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué empacaron en sus mochilas?",
                        options = listOf(
                            "Comida y ropa caliente",
                            "Juguetes y libros",
                            "Cámaras y binoculares",
                            "Instrumentos musicales"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron durante el viaje?",
                        options = listOf(
                            "Observaron hermosos paisajes y respiraron aire fresco",
                            "Nadaron en un lago",
                            "Jugaron juegos de mesa",
                            "Miraron películas en la carpa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Juan al alcanzar la cima de la montaña?",
                        options = listOf(
                            "Orgulloso de su logro",
                            "Asustado y cansado",
                            "Triste y decepcionado",
                            "Enojado y frustrado"
                        )
                    )
                ),
                image = R.drawable.viaje_a_monta_a
            ),
            ReadingItem(
                id = 2,
                title = "La carrera de bicicletas",
                reading = "En el pueblo, se organizó una emocionante carrera de bicicletas. Pedro y sus amigos decidieron participar. Prepararon sus bicicletas y se pusieron sus cascos. La carrera comenzó y pedalearon rápidamente por las calles. Había subidas empinadas y bajadas emocionantes. Pedro se esforzó al máximo y logró cruzar la línea de meta en primer lugar. Ganó una medalla y se sintió orgulloso de su logro.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se organizó en el pueblo?",
                        options = listOf(
                            "Una carrera de bicicletas",
                            "Una carrera de autos",
                            "Un concurso de baile",
                            "Una competencia de natación"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron Pedro y sus amigos para participar en la carrera?",
                        options = listOf(
                            "Prepararon sus bicicletas y se pusieron sus cascos",
                            "Corrieron a pie",
                            "Montaron en patinetas",
                            "Nadaron en el río"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué encontraron durante la carrera?",
                        options = listOf(
                            "Subidas empinadas y bajadas emocionantes",
                            "Juegos y premios",
                            "Animales salvajes",
                            "Caminos bloqueados"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Pedro al cruzar la línea de meta en primer lugar?",
                        options = listOf(
                            "Orgulloso de su logro",
                            "Triste y decepcionado",
                            "Asustado y cansado",
                            "Enojado y frustrado"
                        )
                    )

                ),
                image = R.drawable.carrera_bicicleta
            ),
            ReadingItem(
                id = 3,
                title = "El misterio del tesoro perdido",
                reading = "Lara y su hermano encontraron un viejo mapa que mostraba la ubicación de un tesoro perdido. Decidieron ir en busca de él. Siguiendo las indicaciones del mapa, llegaron a una isla desierta. Excavaron y buscaron pistas, hasta que finalmente encontraron el tesoro enterrado. Estaban emocionados y se llevaron el tesoro a casa. Descubrieron que el verdadero tesoro era la emoción de la aventura y la alegría de trabajar juntos.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué encontraron Lara y su hermano?",
                        options = listOf(
                            "Un viejo mapa",
                            "Un tesoro perdido",
                            "Una isla desierta",
                            "Un cofre misterioso"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron en la isla desierta?",
                        options = listOf(
                            "Excavaron y buscaron pistas",
                            "Descansaron y tomaron el sol",
                            "Jugaron juegos de mesa",
                            "Pescaron en el mar"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué descubrieron sobre el tesoro?",
                        options = listOf(
                            "El verdadero tesoro era la emoción de la aventura y la alegría de trabajar juntos",
                            "Era un tesoro de oro y joyas",
                            "Era un tesoro maldito",
                            "El tesoro pertenecía a un pirata famoso"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintieron Lara y su hermano al encontrar el tesoro?",
                        options = listOf(
                            "Emocionados",
                            "Tristes y decepcionados",
                            "Asustados y cansados",
                            "Enojados y frustrados"
                        )
                    )

                ),
                image = R.drawable.misterio_del_tesoro
            ),
            ReadingItem(
                id = 4,
                title = "El proyecto escolar",
                reading = "En la escuela, los estudiantes tenían que hacer un proyecto sobre el medio ambiente. Ana y sus compañeros eligieron investigar sobre la importancia de reciclar. Recopilaron información, hicieron carteles y dieron una presentación a toda la clase. Explicaron cómo el reciclaje ayuda a proteger el planeta y animaron a todos a reciclar en sus hogares. Fueron elogiados por su trabajo y se sintieron orgullosos de su contribución al cuidado del medio ambiente.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué tenían que hacer los estudiantes en la escuela?",
                        options = listOf(
                            "Hacer un proyecto sobre el medio ambiente",
                            "Hacer un proyecto de matemáticas",
                            "Hacer un proyecto de arte",
                            "Hacer un proyecto de historia"
                        )
                    ),
                    QuestionItem(
                        question = "¿Sobre qué tema eligieron investigar Ana y sus compañeros?",
                        options = listOf(
                            "La importancia de reciclar",
                            "La importancia de ahorrar dinero",
                            "La importancia de hacer ejercicio",
                            "La importancia de leer libros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron para su proyecto?",
                        options = listOf(
                            "Recopilar información, hacer carteles y dar una presentación",
                            "Hacer experimentos científicos",
                            "Escribir una historia",
                            "Dibujar cuadros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintieron Ana y sus compañeros después de su presentación?",
                        options = listOf(
                            "Orgullosos de su contribución al cuidado del medio ambiente",
                            "Tristes y decepcionados",
                            "Asustados y nerviosos",
                            "Enojados y frustrados"
                        )
                    )
                ),
                image = R.drawable.proyecto_escolar
            ),
            ReadingItem(
                id = 5,
                title = "La competencia de talentos",
                reading = "En la escuela, se organizó una competencia de talentos. Los estudiantes tuvieron la oportunidad de mostrar sus habilidades especiales. Pedro decidió tocar la guitarra y cantar una canción. Practicó mucho y se presentó en el escenario. Todos quedaron impresionados por su talento y lo aplaudieron. Pedro se sintió emocionado y agradecido por el apoyo de sus compañeros.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se organizó en la escuela?",
                        options = listOf(
                            "Una competencia de talentos",
                            "Un concurso de baile",
                            "Un partido de fútbol",
                            "Un festival de arte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué decidió hacer Pedro en la competencia?",
                        options = listOf(
                            "Tocar la guitarra y cantar una canción",
                            "Bailar",
                            "Jugar al baloncesto",
                            "Recitar un poema"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se preparó Pedro para la competencia?",
                        options = listOf(
                            "Practicó mucho",
                            "Miró televisión",
                            "Jugó videojuegos",
                            "Durmió todo el día"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Pedro después de su presentación?",
                        options = listOf(
                            "Emocionado y agradecido por el apoyo de sus compañeros",
                            "Triste y decepcionado",
                            "Asustado y nervioso",
                            "Enojado y frustrado"
                        )
                    )
                ),
                image = R.drawable.competencia_talentos
            ),
            ReadingItem(
                id = 6,
                title = "La excursión al museo",
                reading = "La clase de Sofía fue de excursión al museo de historia. Aprendieron sobre dinosaurios, antiguas civilizaciones y obras de arte famosas. Sofía estaba fascinada con los fósiles de dinosaurios y disfrutó mirando las pinturas en el museo. Al final de la excursión, todos compartieron sus experiencias y Sofía se sintió feliz por haber aprendido tantas cosas interesantes.",
                questions = listOf(
                    QuestionItem(
                        question = "¿A qué lugar fue la clase de Sofía de excursión?",
                        options = listOf(
                            "Al museo de historia",
                            "Al zoológico",
                            "Al parque de atracciones",
                            "Al centro comercial"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué aprendieron en el museo?",
                        options = listOf(
                            "Sobre dinosaurios, antiguas civilizaciones y obras de arte famosas",
                            "Sobre plantas y animales",
                            "Sobre deportes y juegos",
                            "Sobre ciencia y tecnología"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué fascinó a Sofía en el museo?",
                        options = listOf(
                            "Los fósiles de dinosaurios",
                            "Los animales vivos",
                            "Las montañas rusas",
                            "Los juguetes antiguos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Sofía al final de la excursión?",
                        options = listOf(
                            "Feliz por haber aprendido tantas cosas interesantes",
                            "Triste y decepcionada",
                            "Aburrida y cansada",
                            "Enojada y frustrada"
                        )
                    )
                ),
                image = R.drawable.excursion_al_museo
            ),
            ReadingItem(
                id = 7,
                title = "El concurso de escritura",
                reading = "En la escuela, se anunció un concurso de escritura. María decidió participar y escribió una historia sobre una aventura en el espacio. Trabajó duro en su historia, corrigiendo errores y mejorando el contenido. Cuando presentó su historia, los jueces quedaron impresionados por su creatividad y estilo de escritura. María ganó el primer lugar en el concurso y se sintió muy orgullosa de su logro.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se anunció en la escuela?",
                        options = listOf(
                            "Un concurso de escritura",
                            "Un concurso de matemáticas",
                            "Un concurso de música",
                            "Un concurso de arte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué escribió María para el concurso?",
                        options = listOf(
                            "Una historia sobre una aventura en el espacio",
                            "Un poema",
                            "Una canción",
                            "Una obra de teatro"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo María para mejorar su historia?",
                        options = listOf(
                            "Corrigió errores y mejoró el contenido",
                            "Hizo dibujos",
                            "Hizo experimentos",
                            "Habló con amigos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió María al ganar el primer lugar en el concurso?",
                        options = listOf(
                            "Muy orgullosa de su logro",
                            "Triste y decepcionada",
                            "Asustada y nerviosa",
                            "Enojada y frustrada"
                        )
                    )
                ),
                image = R.drawable.concurso_de_escritura
            ),
            ReadingItem(
                id = 8,
                title = "El día de campo",
                reading = "La escuela organizó un día de campo en el parque. Los estudiantes llevaron sus meriendas y juegos al aire libre. Jugaron al fútbol, hicieron carreras y se divirtieron mucho. También tuvieron tiempo para relajarse bajo los árboles y disfrutar del buen clima. Fue un día lleno de risas y alegría, y todos regresaron a casa con hermosos recuerdos.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué organizó la escuela?",
                        options = listOf(
                            "Un día de campo",
                            "Un día de excursión",
                            "Un día de clases extra",
                            "Un día de examen"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué llevaron los estudiantes al día de campo?",
                        options = listOf(
                            "Sus meriendas y juegos al aire libre",
                            "Sus libros de texto",
                            "Sus instrumentos musicales",
                            "Sus computadoras"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué actividades hicieron los estudiantes durante el día de campo?",
                        options = listOf(
                            "Jugaron al fútbol, hicieron carreras y se divirtieron mucho",
                            "Estudiaron para los exámenes",
                            "Hicieron ejercicios de matemáticas",
                            "Practicaron música"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintieron los estudiantes al final del día de campo?",
                        options = listOf(
                            "Llenos de risas y alegría, y con hermosos recuerdos",
                            "Tristes y decepcionados",
                            "Cansados y aburridos",
                            "Enojados y frustrados"
                        )
                    )
                ),
                image = R.drawable.dia_de_campo
            ),
            ReadingItem(
                id = 9,
                title = "El viaje en globo",
                reading = "María y su familia decidieron hacer un emocionante viaje en globo aerostático. Subieron a la canasta y el globo comenzó a elevarse lentamente. Desde las alturas, pudieron ver un hermoso paisaje con montañas, ríos y campos verdes. Fue una experiencia única y emocionante para María y su familia. Disfrutaron del paseo y tomaron muchas fotos para recordar ese momento especial.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué decidieron hacer María y su familia?",
                        options = listOf(
                            "Un viaje en globo aerostático",
                            "Un viaje en barco",
                            "Un viaje en tren",
                            "Un viaje en avión"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué vieron desde el globo?",
                        options = listOf(
                            "Un hermoso paisaje con montañas, ríos y campos verdes",
                            "Un parque de diversiones",
                            "Un centro comercial",
                            "Un estadio de fútbol"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintieron María y su familia durante el paseo en globo?",
                        options = listOf(
                            "Emocionados y felices",
                            "Tristes y decepcionados",
                            "Asustados y nerviosos",
                            "Enojados y frustrados"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron para recordar ese momento especial?",
                        options = listOf(
                            "Tomaron muchas fotos",
                            "Compraron recuerdos",
                            "Escribieron un diario",
                            "Dibujaron el paisaje"
                        )
                    )
                ),
                image = R.drawable.viaje_en_globo_1
            ),
            ReadingItem(
                id = 10,
                title = "El proyecto de ciencias",
                reading = "En la clase de ciencias, los estudiantes tenían que hacer un proyecto sobre el ciclo del agua. Lucas decidió construir un modelo en el que representaba cómo el agua se evaporaba, formaba nubes y luego caía en forma de lluvia. Presentó su proyecto a la clase y explicó cada etapa del ciclo del agua. Fue un proyecto interesante y Lucas se sintió orgulloso de su trabajo.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Sobre qué tema tenían que hacer el proyecto los estudiantes?",
                        options = listOf(
                            "El ciclo del agua",
                            "El ciclo de vida de una planta",
                            "El sistema solar",
                            "Los animales marinos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué decidió hacer Lucas para su proyecto?",
                        options = listOf(
                            "Construir un modelo del ciclo del agua",
                            "Hacer un experimento",
                            "Hacer un dibujo",
                            "Hacer una presentación en PowerPoint"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Lucas al presentar su proyecto?",
                        options = listOf(
                            "Orgulloso de su trabajo",
                            "Triste y decepcionado",
                            "Asustado y nervioso",
                            "Enojado y frustrado"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué explicó Lucas durante la presentación de su proyecto?",
                        options = listOf(
                            "Explicó cada etapa del ciclo del agua",
                            "Explicó cómo crecen las plantas",
                            "Explicó los planetas del sistema solar",
                            "Explicó diferentes especies de animales marinos"
                        )
                    )
                ),
                image = R.drawable.proyecto_ciencias
            ),

            ReadingItem(
                id = 11,
                title = "La obra de teatro",
                reading = "En la escuela, los estudiantes prepararon una obra de teatro para el festival anual. María obtuvo el papel principal y practicó sus líneas todos los días. El día del festival, subió al escenario y actuó con pasión y energía. El público aplaudió al final de la actuación y María se sintió feliz y orgullosa de su desempeño.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué prepararon los estudiantes para el festival anual?",
                        options = listOf(
                            "Una obra de teatro",
                            "Un concierto",
                            "Una competencia de baile",
                            "Un desfile"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué papel obtuvo María en la obra de teatro?",
                        options = listOf(
                            "El papel principal",
                            "Un papel secundario",
                            "El papel de villano",
                            "El papel de narrador"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió María al subir al escenario?",
                        options = listOf(
                            "Con pasión y energía",
                            "Triste y decepcionada",
                            "Asustada y nerviosa",
                            "Enojada y frustrada"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo reaccionó el público al final de la actuación de María?",
                        options = listOf(
                            "Aplaudió",
                            "Silbó",
                            "Abucheó",
                            "Se quedó en silencio"
                        )
                    )
                ),
                image = R.drawable.obra_de_teatro
            ),

            ReadingItem(
                id = 12,
                title = "El proyecto de historia",
                reading = "Los estudiantes de historia tenían que hacer un proyecto sobre una figura histórica importante. Juan decidió investigar sobre Leonardo da Vinci. Recopiló información sobre su vida y logros, y creó un póster informativo. Presentó su proyecto a la clase y compartió detalles interesantes sobre la vida de Leonardo da Vinci. Todos quedaron impresionados por su trabajo y Juan se sintió satisfecho con los resultados.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Sobre qué tema tenían que hacer el proyecto los estudiantes?",
                        options = listOf(
                            "Una figura histórica importante",
                            "Un evento histórico",
                            "Una batalla",
                            "Un descubrimiento científico"
                        )
                    ),
                    QuestionItem(
                        question = "¿Sobre quién decidió investigar Juan para su proyecto?",
                        options = listOf(
                            "Leonardo da Vinci",
                            "Isaac Newton",
                            "Napoleón Bonaparte",
                            "Cleopatra"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Juan para su proyecto?",
                        options = listOf(
                            "Recopiló información y creó un póster informativo",
                            "Hizo un experimento",
                            "Hizo un video",
                            "Hizo una maqueta"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Juan al presentar su proyecto?",
                        options = listOf(
                            "Satisfecho con los resultados",
                            "Triste y decepcionado",
                            "Asustado y nervioso",
                            "Enojado y frustrado"
                        )
                    )
                ),
                image = R.drawable.proyecto_de_historia
            ),
            ReadingItem(
                id = 13,
                title = "La competencia de deletreo",
                reading = "En la escuela se llevó a cabo una competencia de deletreo. Los estudiantes se prepararon estudiando las palabras difíciles y practicando la pronunciación. Juan fue uno de los finalistas y se esforzó en deletrear las palabras correctamente. Al final, ganó la competencia y recibió un premio por su habilidad en el deletreo. Se sintió muy orgulloso de su logro.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué tipo de competencia se llevó a cabo en la escuela?",
                        options = listOf(
                            "Una competencia de deletreo",
                            "Una competencia de matemáticas",
                            "Una competencia de canto",
                            "Una competencia de baile"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se prepararon los estudiantes para la competencia?",
                        options = listOf(
                            "Estudiando palabras difíciles y practicando la pronunciación",
                            "Estudiando problemas matemáticos",
                            "Practicando canciones",
                            "Aprendiendo coreografías de baile"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué logró Juan en la competencia?",
                        options = listOf(
                            "Ganó la competencia",
                            "Quedó en segundo lugar",
                            "Quedó en tercer lugar",
                            "No ganó ningún premio"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Juan al ganar la competencia?",
                        options = listOf(
                            "Muy orgulloso de su logro",
                            "Triste y decepcionado",
                            "Asustado y nervioso",
                            "Enojado y frustrado"
                        )
                    )
                ),
                image = R.drawable.competencia_de_deletreo
            ),
            ReadingItem(
                id = 14,
                title = "El campamento de verano",
                reading = "Durante las vacaciones de verano, Pedro asistió a un campamento. Pasó tiempo al aire libre, hizo caminatas y aprendió a hacer fogatas. También hizo nuevos amigos y participó en actividades grupales. Fue una experiencia divertida y emocionante para Pedro, y regresó a casa con hermosos recuerdos y habilidades nuevas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué hizo Pedro durante las vacaciones de verano?",
                        options = listOf(
                            "Asistió a un campamento",
                            "Viajó al extranjero",
                            "Se quedó en casa",
                            "Fue a la playa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué actividades realizó Pedro en el campamento?",
                        options = listOf(
                            "Pasó tiempo al aire libre, hizo caminatas y aprendió a hacer fogatas",
                            "Estudió para los exámenes",
                            "Hizo ejercicios de matemáticas",
                            "Practicó música"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Pedro durante el campamento?",
                        options = listOf(
                            "Hizo nuevos amigos y participó en actividades grupales",
                            "Se quedó solo en su tienda de campaña",
                            "No hizo amigos",
                            "No participó en actividades"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Pedro al final del campamento?",
                        options = listOf(
                            "Divertido y emocionado, con hermosos recuerdos y habilidades nuevas",
                            "Triste y decepcionado",
                            "Cansado y aburrido",
                            "Enojado y frustrado"
                        )
                    )
                ),
                image = R.drawable.campamento_de_verano
            ),
            ReadingItem(
                id = 15,
                title = "El concurso de talentos",
                reading = "En la escuela se organizó un concurso de talentos. Los estudiantes mostraron sus habilidades en el canto, el baile, la magia y otros talentos. Sofía decidió cantar una canción y ensayó durante semanas. Cuando llegó su turno, subió al escenario y deslumbró a todos con su voz melodiosa. Fue una actuación impresionante y Sofía se llevó el primer lugar en el concurso.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se organizó en la escuela?",
                        options = listOf(
                            "Un concurso de talentos",
                            "Una feria",
                            "Una exposición de arte",
                            "Una competencia deportiva"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué decidió hacer Sofía en el concurso de talentos?",
                        options = listOf(
                            "Cantar una canción",
                            "Bailar",
                            "Hacer magia",
                            "Recitar un poema"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintió Sofía al deslumbrar a todos con su actuación?",
                        options = listOf(
                            "Feliz y orgullosa",
                            "Triste y decepcionada",
                            "Asustada y nerviosa",
                            "Enojada y frustrada"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué lugar ocupó Sofía en el concurso de talentos?",
                        options = listOf(
                            "Primer lugar",
                            "Segundo lugar",
                            "Tercer lugar",
                            "No ganó ningún premio"
                        )
                    )
                ),
                image = R.drawable.competencia_talentos
            ),

            ReadingItem(
                id = 16,
                title = "El viaje en tren",
                reading = "María y su familia decidieron hacer un viaje en tren. Compraron los boletos y se subieron al tren. Durante el viaje, pudieron disfrutar del paisaje, ver hermosos campos y montañas. También se divirtieron jugando juegos de mesa y compartiendo meriendas. Fue un viaje emocionante y lleno de aventuras para María y su familia.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué decidieron hacer María y su familia?",
                        options = listOf(
                            "Hacer un viaje en tren",
                            "Hacer un viaje en avión",
                            "Hacer un viaje en automóvil",
                            "Hacer un viaje en barco"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pudieron disfrutar durante el viaje en tren?",
                        options = listOf(
                            "El paisaje, hermosos campos y montañas",
                            "Las atracciones turísticas",
                            "Los museos",
                            "Las tiendas y restaurantes"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se divirtieron María y su familia durante el viaje?",
                        options = listOf(
                            "Jugando juegos de mesa y compartiendo meriendas",
                            "Mirando televisión",
                            "Durmiendo",
                            "Leyendo libros"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo fue el viaje para María y su familia?",
                        options = listOf(
                            "Emocionante y lleno de aventuras",
                            "Aburrido y monótono",
                            "Estresante y agotador",
                            "Corto y sin emociones"
                        )
                    )
                ),
                image = R.drawable.viaje_en_tren
            ),

            ReadingItem(
                id = 17,
                title = "El experimento científico",
                reading = "Pedro decidió hacer un experimento científico para su clase de ciencias. El experimento consistía en observar cómo crecían las plantas en diferentes condiciones de luz. Pedro colocó algunas plantas cerca de una ventana y otras en un armario oscuro. Regó las plantas regularmente y anotó sus observaciones durante varias semanas. Al final del experimento, pudo concluir que las plantas que recibieron luz crecieron más saludables y altas que las que estaban en la oscuridad.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué decidió hacer Pedro para su clase de ciencias?",
                        options = listOf(
                            "Un experimento científico",
                            "Un proyecto de arte",
                            "Una investigación histórica",
                            "Una presentación de matemáticas"
                        )
                    ),
                    QuestionItem(
                        question = "¿En qué consistía el experimento de Pedro?",
                        options = listOf(
                            "Observar cómo crecían las plantas en diferentes condiciones de luz",
                            "Observar el comportamiento de los animales",
                            "Observar el movimiento de los planetas",
                            "Observar cómo se forman las nubes"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hizo Pedro para llevar a cabo su experimento?",
                        options = listOf(
                            "Colocó algunas plantas cerca de una ventana y otras en un armario oscuro",
                            "Colocó las plantas en un acuario",
                            "Colocó las plantas en el jardín",
                            "Colocó las plantas en un frigorífico"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuál fue la conclusión de Pedro al final del experimento?",
                        options = listOf(
                            "Las plantas que recibieron luz crecieron más saludables y altas que las que estaban en la oscuridad",
                            "Todas las plantas crecieron de la misma manera",
                            "Las plantas que estaban en la oscuridad crecieron más saludables y altas que las que recibieron luz",
                            "Las plantas no crecieron en absoluto"
                        )
                    )
                ),
                image = R.drawable.experimento_cientifico
            ),
            ReadingItem(
                id = 18,
                title = "El día de campo",
                reading = "El colegio organizó un día de campo en el parque. Los estudiantes llevaron sus meriendas y jugaron juegos al aire libre. Hubo una carrera de sacos, un juego de lanzamiento de aros y un concurso de saltos. Todos se divirtieron mucho y disfrutaron del día soleado. Fue una jornada llena de risas, amistad y actividades al aire libre.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué organizó el colegio en el parque?",
                        options = listOf(
                            "Un día de campo",
                            "Un concierto",
                            "Un festival",
                            "Una exposición de arte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué llevaron los estudiantes al día de campo?",
                        options = listOf(
                            "Sus meriendas",
                            "Sus juguetes",
                            "Sus libros",
                            "Sus instrumentos musicales"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué juegos se llevaron a cabo durante el día de campo?",
                        options = listOf(
                            "Una carrera de sacos, un juego de lanzamiento de aros y un concurso de saltos",
                            "Un juego de cartas",
                            "Un juego de ajedrez",
                            "Un juego de video"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se sintieron los estudiantes durante el día de campo?",
                        options = listOf(
                            "Se divirtieron mucho y disfrutaron del día soleado",
                            "Estaban aburridos y deseaban irse a casa",
                            "Estaban tristes y decepcionados",
                            "Estaban enojados y frustrados"
                        )
                    )
                ),
                image = R.drawable.dia_de_campo_2
            ),
            ReadingItem(
                id = 19,
                title = "El proyecto de ciencias",
                reading = "Ana y su compañero de clase decidieron hacer un proyecto de ciencias juntos. El proyecto consistía en construir un volcán en miniatura y simular una erupción. Reunieron los materiales necesarios, como arcilla y vinagre con bicarbonato de sodio. Siguieron los pasos y lograron que el volcán hiciera erupción con espuma y humo. Fue un proyecto divertido y educativo que les enseñó sobre los volcanes y las reacciones químicas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué decidieron hacer Ana y su compañero de clase juntos?",
                        options = listOf(
                            "Un proyecto de ciencias",
                            "Un proyecto de arte",
                            "Un proyecto de matemáticas",
                            "Un proyecto de historia"
                        )
                    ),
                    QuestionItem(
                        question = "¿En qué consistía el proyecto de ciencias?",
                        options = listOf(
                            "Construir un volcán en miniatura y simular una erupción",
                            "Construir un cohete espacial",
                            "Construir un puente",
                            "Construir una casa"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué materiales utilizaron para el proyecto?",
                        options = listOf(
                            "Arcilla y vinagre con bicarbonato de sodio",
                            "Papel y lápices",
                            "Madera y clavos",
                            "Arena y agua"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué aprendieron Ana y su compañero de clase a través del proyecto?",
                        options = listOf(
                            "Aprendieron sobre los volcanes y las reacciones químicas",
                            "Aprendieron sobre los animales",
                            "Aprendieron sobre la historia antigua",
                            "Aprendieron sobre las ecuaciones matemáticas"
                        )
                    )
                ),
                image = R.drawable.proyecto_ciencias
            ),
            ReadingItem(
                id = 20,
                title = "El viaje en globo",
                reading = "Pablo y su familia decidieron hacer un emocionante viaje en globo aerostático. Se levantaron temprano por la mañana y se encontraron con el piloto y el equipo. Despegaron suavemente y se elevaron por encima de las nubes. Desde el globo, pudieron admirar un hermoso paisaje y ver la ciudad desde lo alto. Fue una experiencia única y llena de emociones para Pablo y su familia.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué decidieron hacer Pablo y su familia?",
                        options = listOf(
                            "Hacer un viaje en globo aerostático",
                            "Hacer un viaje en barco",
                            "Hacer un viaje en tren",
                            "Hacer un viaje en automóvil"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué hicieron temprano por la mañana?",
                        options = listOf(
                            "Se encontraron con el piloto y el equipo",
                            "Se encontraron con sus amigos",
                            "Se prepararon el desayuno",
                            "Se fueron a dormir"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pudieron admirar desde el globo?",
                        options = listOf(
                            "Un hermoso paisaje y la ciudad desde lo alto",
                            "Un campo de fútbol",
                            "Un museo",
                            "Un centro comercial"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo fue la experiencia para Pablo y su familia?",
                        options = listOf(
                            "Una experiencia única y llena de emociones",
                            "Una experiencia aburrida y monótona",
                            "Una experiencia aterradora y peligrosa",
                            "Una experiencia corta y sin emociones"
                        )
                    )
                ),
                image = R.drawable.viaje_en_globo_2
            )

        )
    }
}