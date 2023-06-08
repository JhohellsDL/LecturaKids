package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingAdvancedProvider {
    fun loadReadingAdvanced(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Inteligencia artificial",
                reading = "La inteligencia artificial (IA) es un campo de estudio que se enfoca en crear sistemas capaces de realizar tareas que requieren inteligencia humana. Los sistemas de IA pueden aprender, razonar, planificar y resolver problemas de manera similar a los humanos. Algunas aplicaciones de la IA incluyen asistentes virtuales, reconocimiento de voz, vehículos autónomos y análisis de datos. A medida que la tecnología avanza, se espera que la IA tenga un impacto significativo en diversas industrias y aspectos de nuestra vida cotidiana.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es la inteligencia artificial?",
                        options = listOf(
                            "Un campo de estudio que se enfoca en crear sistemas capaces de realizar tareas que requieren inteligencia humana",
                            "Un tipo de robot",
                            "Un videojuego popular",
                            "Una forma de energía renovable"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué pueden hacer los sistemas de IA?",
                        options = listOf(
                            "Aprender, razonar, planificar y resolver problemas de manera similar a los humanos",
                            "Realizar tareas físicas únicamente",
                            "Realizar tareas matemáticas complejas",
                            "Crear obras de arte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunas aplicaciones de la IA?",
                        options = listOf(
                            "Asistentes virtuales, reconocimiento de voz, vehículos autónomos y análisis de datos",
                            "Juegos de mesa, música y cine",
                            "Cocina, jardinería y deportes",
                            "Arquitectura, moda y literatura"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué se espera del futuro de la IA?",
                        options = listOf(
                            "Que tenga un impacto significativo en diversas industrias y aspectos de nuestra vida cotidiana",
                            "Que desaparezca y sea reemplazada por otras tecnologías",
                            "Que se limite a aplicaciones específicas",
                            "Que sea utilizada únicamente en la investigación científica"
                        )
                    )
                ),
                image = R.drawable.inteligencia_artificial
            ),

            ReadingItem(
                id = 2,
                title = "La exploración espacial",
                reading = "La exploración espacial es el viaje y la investigación de objetos y fenómenos en el espacio exterior. Los seres humanos han enviado sondas espaciales, satélites y astronautas para explorar planetas, lunas, asteroides y más allá. Algunos hitos importantes en la exploración espacial incluyen el alunizaje del Apolo 11 en 1969 y el envío de misiones robóticas a Marte. La exploración espacial ha contribuido al avance científico, tecnológico y nuestro entendimiento del universo.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es la exploración espacial?",
                        options = listOf(
                            "El viaje y la investigación de objetos y fenómenos en el espacio exterior",
                            "El estudio de la Tierra y sus ecosistemas",
                            "La búsqueda de vida extraterrestre",
                            "La exploración de las profundidades del océano"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué han enviado los seres humanos para explorar el espacio?",
                        options = listOf(
                            "Sondas espaciales, satélites y astronautas",
                            "Submarinos y buceadores",
                            "Aviones y pilotos",
                            "Cámaras y fotógrafos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuál fue un hito importante en la exploración espacial?",
                        options = listOf(
                            "El alunizaje del Apolo 11 en 1969",
                            "El descubrimiento de una nueva galaxia",
                            "El primer vuelo espacial tripulado",
                            "El descubrimiento de un nuevo planeta habitable"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué contribuciones ha hecho la exploración espacial?",
                        options = listOf(
                            "Avance científico, tecnológico y nuestro entendimiento del universo",
                            "Avance médico y desarrollo de nuevas enfermedades",
                            "Avance en la agricultura y la alimentación",
                            "Avance en el arte y la cultura"
                        )
                    )
                ),
                image = R.drawable.exploracion_espacial
            ),
            ReadingItem(
                id = 3,
                title = "La energía renovable",
                reading = "La energía renovable se refiere a fuentes de energía que son inagotables y amigables con el medio ambiente. Algunos ejemplos de energía renovable son la solar, eólica, hidroeléctrica y geotérmica. Estas fuentes de energía utilizan recursos naturales como la luz solar, el viento, el agua y el calor de la Tierra para generar electricidad o calor. La energía renovable es una alternativa sostenible a los combustibles fósiles y contribuye a la reducción de emisiones de gases de efecto invernadero.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es la energía renovable?",
                        options = listOf(
                            "Fuentes de energía inagotables y amigables con el medio ambiente",
                            "Fuentes de energía que se agotan rápidamente",
                            "Fuentes de energía que contaminan el medio ambiente",
                            "Fuentes de energía producidas a partir de combustibles fósiles"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos ejemplos de energía renovable?",
                        options = listOf(
                            "Solar, eólica, hidroeléctrica y geotérmica",
                            "Gasolina, carbón, petróleo y gas natural",
                            "Plástico, vidrio, metal y papel",
                            "Electricidad, agua, gas y vapor"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué recursos naturales se utilizan en la generación de energía renovable?",
                        options = listOf(
                            "Luz solar, viento, agua y calor de la Tierra",
                            "Metales y minerales",
                            "Madera y papel",
                            "Plástico y vidrio"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué la energía renovable es importante?",
                        options = listOf(
                            "Es una alternativa sostenible a los combustibles fósiles y contribuye a la reducción de emisiones de gases de efecto invernadero",
                            "Es más barata y eficiente que otras formas de energía",
                            "No tiene ningún impacto en el medio ambiente",
                            "Es una fuente de energía limitada y escasa"
                        )
                    )
                ),
                image = R.drawable.energia_renovable
            ),

            ReadingItem(
                id = 4,
                title = "La inteligencia emocional",
                reading = "La inteligencia emocional se refiere a la capacidad de reconocer, entender y gestionar las emociones propias y de los demás. Involucra habilidades como el autocontrol, la empatía y la habilidad para manejar las relaciones. La inteligencia emocional es importante para el bienestar personal, las relaciones saludables y el éxito en diferentes áreas de la vida. Se puede desarrollar a través de la práctica y la adquisición de habilidades emocionales.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es la inteligencia emocional?",
                        options = listOf(
                            "La capacidad de reconocer, entender y gestionar las emociones propias y de los demás",
                            "La capacidad de resolver problemas matemáticos",
                            "La capacidad de aprender nuevos idiomas",
                            "La capacidad de memorizar información rápidamente"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué habilidades involucra la inteligencia emocional?",
                        options = listOf(
                            "Autocontrol, empatía y habilidad para manejar las relaciones",
                            "Habilidades deportivas y artísticas",
                            "Habilidades de comunicación escrita",
                            "Habilidades de programación y codificación"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante la inteligencia emocional?",
                        options = listOf(
                            "Para el bienestar personal, las relaciones saludables y el éxito en diferentes áreas de la vida",
                            "Para el éxito académico exclusivamente",
                            "Para el éxito en el deporte y la competencia",
                            "Para el éxito en el mundo empresarial únicamente"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se puede desarrollar la inteligencia emocional?",
                        options = listOf(
                            "A través de la práctica y la adquisición de habilidades emocionales",
                            "A través del estudio intensivo",
                            "A través de la meditación exclusivamente",
                            "A través de la genética y la herencia"
                        )
                    )
                ),
                image = R.drawable.inteligencia_emocional
            ),
            ReadingItem(
                id = 5,
                title = "La conservación del medio ambiente",
                reading = "La conservación del medio ambiente se refiere a la protección y preservación de los recursos naturales y los ecosistemas. Involucra prácticas como el reciclaje, la reducción del consumo de energía y agua, la protección de la flora y fauna, y la promoción de energías renovables. La conservación del medio ambiente es importante para garantizar un planeta saludable y sostenible para las generaciones futuras.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es la conservación del medio ambiente?",
                        options = listOf(
                            "La protección y preservación de los recursos naturales y los ecosistemas",
                            "El uso excesivo de recursos naturales",
                            "La destrucción del medio ambiente",
                            "La contaminación del aire y el agua"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué prácticas se pueden llevar a cabo para conservar el medio ambiente?",
                        options = listOf(
                            "Reciclaje, reducción del consumo de energía y agua, protección de la flora y fauna, promoción de energías renovables",
                            "Consumo excesivo de recursos naturales",
                            "Uso indiscriminado de productos químicos",
                            "Generación de basura y desechos sin control"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante la conservación del medio ambiente?",
                        options = listOf(
                            "Para garantizar un planeta saludable y sostenible para las generaciones futuras",
                            "Para obtener beneficios económicos a corto plazo",
                            "Para promover el consumismo y el crecimiento desmedido",
                            "Para aumentar la contaminación y el cambio climático"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuál es el papel de las energías renovables en la conservación del medio ambiente?",
                        options = listOf(
                            "Contribuyen a reducir la dependencia de los combustibles fósiles y disminuir las emisiones de gases de efecto invernadero",
                            "Generan contaminación y daño al medio ambiente",
                            "No tienen ningún impacto en la conservación del medio ambiente",
                            "Son menos eficientes y más costosas que las energías no renovables"
                        )
                    )
                ),
                image = R.drawable.conservacion_del_medio
            ),
            ReadingItem(
                id = 6,
                title = "La inteligencia artificial en la medicina",
                reading = "La inteligencia artificial (IA) está revolucionando el campo de la medicina. Se utiliza para analizar grandes cantidades de datos médicos, realizar diagnósticos más precisos, identificar patrones en enfermedades y mejorar los tratamientos. La IA puede ayudar a los médicos a tomar decisiones informadas y mejorar la atención médica. Algunas aplicaciones de la IA en la medicina incluyen la detección temprana de enfermedades, la asistencia en cirugías y el desarrollo de medicamentos.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo está revolucionando la inteligencia artificial el campo de la medicina?",
                        options = listOf(
                            "Analizando datos médicos, realizando diagnósticos más precisos, identificando patrones en enfermedades y mejorando los tratamientos",
                            "Reemplazando por completo a los médicos",
                            "Creando enfermedades artificiales",
                            "Realizando intervenciones quirúrgicas sin la ayuda de médicos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo puede ayudar la inteligencia artificial a los médicos?",
                        options = listOf(
                            "A tomar decisiones informadas y mejorar la atención médica",
                            "A realizar tratamientos médicos sin supervisión",
                            "A sustituir la formación médica",
                            "A reducir la necesidad de profesionales de la salud"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunas aplicaciones de la inteligencia artificial en la medicina?",
                        options = listOf(
                            "Detección temprana de enfermedades, asistencia en cirugías, desarrollo de medicamentos",
                            "Creación de enfermedades artificiales",
                            "Manipulación genética",
                            "Creación de órganos artificiales"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué beneficios puede aportar la inteligencia artificial a la medicina?",
                        options = listOf(
                            "Mayor precisión en los diagnósticos, identificación de tratamientos más efectivos y mejora de la atención médica",
                            "Aumento de los costos médicos",
                            "Reducción de la calidad de la atención médica",
                            "Disminución de la seguridad y privacidad de los pacientes"
                        )
                    )
                ),
                image = R.drawable.en_la_medicina
            ),
            ReadingItem(
                id = 7,
                title = "El cambio climático",
                reading = "El cambio climático es un fenómeno global que se caracteriza por el aumento de la temperatura promedio de la Tierra. Este cambio es causado principalmente por la acumulación de gases de efecto invernadero en la atmósfera, resultado de actividades humanas como la quema de combustibles fósiles y la deforestación. El cambio climático tiene impactos significativos en el medio ambiente, la biodiversidad, la economía y la salud humana. Es importante tomar medidas para reducir las emisiones de gases de efecto invernadero y adaptarse a los cambios climáticos.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué es el cambio climático?",
                        options = listOf(
                            "Un fenómeno global que se caracteriza por el aumento de la temperatura promedio de la Tierra",
                            "Un fenómeno local que afecta solo a algunas regiones",
                            "Un fenómeno natural sin influencia humana",
                            "Un fenómeno temporal sin consecuencias a largo plazo"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué causa el cambio climático?",
                        options = listOf(
                            "La acumulación de gases de efecto invernadero en la atmósfera, resultado de actividades humanas",
                            "La actividad volcánica",
                            "Los cambios en la órbita de la Tierra",
                            "Los cambios en la radiación solar"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos impactos del cambio climático?",
                        options = listOf(
                            "Impactos en el medio ambiente, la biodiversidad, la economía y la salud humana",
                            "Impactos exclusivamente en el clima",
                            "Impactos en la tecnología y la industria",
                            "Impactos en la exploración espacial"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué medidas se pueden tomar para abordar el cambio climático?",
                        options = listOf(
                            "Reducir las emisiones de gases de efecto invernadero y adaptarse a los cambios climáticos",
                            "Aumentar la producción de combustibles fósiles",
                            "Promover la deforestación",
                            "Ignorar los problemas relacionados con el cambio climático"
                        )
                    )
                ),
                image = R.drawable.cambio_climatico
            ),
            ReadingItem(
                id = 8,
                title = "La inteligencia artificial en la industria",
                reading = "La inteligencia artificial (IA) está transformando la industria al mejorar la eficiencia, la productividad y la toma de decisiones. La IA se utiliza en la automatización de procesos, el análisis de datos, la optimización de la cadena de suministro y la personalización de productos y servicios. Algunas aplicaciones de la IA en la industria incluyen el mantenimiento predictivo, la gestión de inventario y la mejora de la experiencia del cliente. La IA tiene el potencial de revolucionar la forma en que se llevan a cabo los negocios y mejorar la competitividad de las empresas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo está transformando la inteligencia artificial la industria?",
                        options = listOf(
                            "Mejorando la eficiencia, la productividad y la toma de decisiones",
                            "Causando desempleo masivo",
                            "Generando problemas éticos y legales",
                            "Dificultando la gestión de las empresas"
                        )
                    ),
                    QuestionItem(
                        question = "¿En qué áreas se utiliza la inteligencia artificial en la industria?",
                        options = listOf(
                            "Automatización de procesos, análisis de datos, optimización de la cadena de suministro, personalización de productos y servicios",
                            "Gestión de recursos humanos",
                            "Creación de productos y servicios sin intervención humana",
                            "Eliminación de la necesidad de empleados en las empresas"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunas aplicaciones de la inteligencia artificial en la industria?",
                        options = listOf(
                            "Mantenimiento predictivo, gestión de inventario, mejora de la experiencia del cliente",
                            "Manipulación genética",
                            "Creación de nuevos materiales",
                            "Generación de energía renovable"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué beneficios puede aportar la inteligencia artificial a las empresas?",
                        options = listOf(
                            "Mejor competitividad, mayor eficiencia, toma de decisiones más informadas",
                            "Aumento de los costos y reducción de la productividad",
                            "Disminución de la calidad de los productos y servicios",
                            "Mayor dependencia de la tecnología y la automatización"
                        )
                    )
                ),
                image = R.drawable.en_la_industria
            ),
            ReadingItem(
                id = 9,
                title = "La inteligencia artificial en la educación",
                reading = "La inteligencia artificial (IA) está transformando el campo de la educación al ofrecer nuevas oportunidades de aprendizaje y mejorar la enseñanza. La IA se utiliza para personalizar el aprendizaje, proporcionar retroalimentación adaptativa, identificar áreas de mejora y ofrecer recursos educativos interactivos. Algunas aplicaciones de la IA en la educación incluyen los sistemas de tutoría inteligente, los asistentes virtuales de aprendizaje y el análisis de datos educativos. La IA tiene el potencial de mejorar la calidad y accesibilidad de la educación.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo está transformando la inteligencia artificial la educación?",
                        options = listOf(
                            "Ofreciendo nuevas oportunidades de aprendizaje y mejorando la enseñanza",
                            "Reemplazando a los maestros",
                            "Generando desigualdades en el acceso a la educación",
                            "Disminuyendo la calidad de la educación"
                        )
                    ),
                    QuestionItem(
                        question = "¿En qué áreas se utiliza la inteligencia artificial en la educación?",
                        options = listOf(
                            "Personalización del aprendizaje, retroalimentación adaptativa, identificación de áreas de mejora, recursos educativos interactivos",
                            "Administración escolar",
                            "Evaluación de los estudiantes",
                            "Creación de planes de estudio sin intervención humana"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunas aplicaciones de la inteligencia artificial en la educación?",
                        options = listOf(
                            "Sistemas de tutoría inteligente, asistentes virtuales de aprendizaje, análisis de datos educativos",
                            "Generación de contenido educativo sin intervención humana",
                            "Control y vigilancia de los estudiantes",
                            "Manipulación de los resultados de las evaluaciones"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué beneficios puede aportar la inteligencia artificial a la educación?",
                        options = listOf(
                            "Mejora de la calidad y accesibilidad de la educación, personalización del aprendizaje, retroalimentación adaptativa",
                            "Aumento de los costos de educación",
                            "Disminución de la interacción humana en el proceso educativo",
                            "Reducción de la diversidad de perspectivas y enfoques educativos"
                        )
                    )
                ),
                image = R.drawable.en_la_educacion
            ),
            ReadingItem(
                id = 10,
                title = "La inteligencia artificial en el transporte",
                reading = "La inteligencia artificial (IA) está revolucionando el campo del transporte al mejorar la eficiencia, la seguridad y la comodidad. La IA se utiliza en la gestión del tráfico, la navegación autónoma, el mantenimiento predictivo de vehículos y la mejora de la experiencia del usuario. Algunas aplicaciones de la IA en el transporte incluyen los vehículos autónomos, los sistemas de control de tráfico inteligente y las asistentes virtuales para la planificación de rutas. La IA tiene el potencial de transformar la forma en que nos movemos y reducir los accidentes de tráfico.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo está revolucionando la inteligencia artificial el campo del transporte?",
                        options = listOf(
                            "Mejorando la eficiencia, la seguridad y la comodidad",
                            "Generando más congestión y problemas de tráfico",
                            "Sustituyendo por completo a los conductores humanos",
                            "Dificultando el acceso al transporte público"
                        )
                    ),
                    QuestionItem(
                        question = "¿En qué áreas se utiliza la inteligencia artificial en el transporte?",
                        options = listOf(
                            "Gestión del tráfico, navegación autónoma, mantenimiento predictivo de vehículos, mejora de la experiencia del usuario",
                            "Creación de nuevos medios de transporte",
                            "Aumento de la velocidad de los vehículos",
                            "Eliminación de la necesidad de infraestructuras de transporte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunas aplicaciones de la inteligencia artificial en el transporte?",
                        options = listOf(
                            "Vehículos autónomos, sistemas de control de tráfico inteligente, asistentes virtuales para la planificación de rutas",
                            "Creación de nuevos combustibles",
                            "Manipulación de las señales de tráfico",
                            "Generación de congestión y embotellamientos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué beneficios puede aportar la inteligencia artificial al transporte?",
                        options = listOf(
                            "Mayor eficiencia, seguridad vial, reducción de accidentes de tráfico",
                            "Aumento de los costos de transporte",
                            "Disminución de la comodidad y la accesibilidad",
                            "Aumento de la contaminación y el consumo de energía"
                        )
                    )
                ),
                image = R.drawable.en_el_transporte
            ),
            ReadingItem(
                id = 11,
                title = "La ética en la inteligencia artificial",
                reading = "La ética en la inteligencia artificial (IA) se refiere a los principios y valores que guían el desarrollo y uso de sistemas de IA. La IA plantea desafíos éticos debido a su capacidad para tomar decisiones autónomas y su potencial impacto en la sociedad. Algunas cuestiones éticas importantes en la IA incluyen la privacidad, la discriminación algorítmica, la responsabilidad y la transparencia. Es crucial considerar los aspectos éticos en el diseño, implementación y regulación de la IA para garantizar su uso beneficioso y evitar consecuencias negativas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se entiende por ética en la inteligencia artificial?",
                        options = listOf(
                            "Principios y valores que guían el desarrollo y uso de sistemas de IA",
                            "Uso indiscriminado de la tecnología",
                            "Ausencia de consecuencias sociales",
                            "Maximización del beneficio económico"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos éticos en la inteligencia artificial?",
                        options = listOf(
                            "Privacidad, discriminación algorítmica, responsabilidad, transparencia",
                            "Estancamiento tecnológico",
                            "Supremacía de la IA sobre los seres humanos",
                            "Limitaciones técnicas"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante considerar la ética en la inteligencia artificial?",
                        options = listOf(
                            "Para garantizar un uso beneficioso y evitar consecuencias negativas",
                            "Para frenar el desarrollo de la IA",
                            "Para evitar el avance de la tecnología",
                            "Para maximizar el poder de la IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué implicaciones éticas tiene la privacidad en la inteligencia artificial?",
                        options = listOf(
                            "Protección de datos personales y respeto a la privacidad de los individuos",
                            "Violación de la privacidad de las empresas",
                            "Acceso indiscriminado a la información personal",
                            "Uso de datos sin restricciones"
                        )
                    )
                ),
                image = R.drawable.etica
            ),
            ReadingItem(
                id = 12,
                title = "El futuro del trabajo y la inteligencia artificial",
                reading = "La inteligencia artificial (IA) está transformando el mundo del trabajo al automatizar tareas y cambiar la forma en que las personas realizan sus labores. Si bien la IA puede generar preocupaciones sobre la pérdida de empleo, también crea oportunidades para la creación de nuevos trabajos y el aumento de la productividad. Es importante prepararse para el futuro del trabajo adquiriendo habilidades relevantes, fomentando la creatividad y adaptándose a los avances tecnológicos. La colaboración entre humanos y sistemas de IA puede ser clave para aprovechar al máximo el potencial de la tecnología y garantizar un futuro laboral inclusivo y sostenible.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo está transformando la inteligencia artificial el mundo del trabajo?",
                        options = listOf(
                            "Automatizando tareas y cambiando la forma de trabajar",
                            "Eliminando por completo los empleos",
                            "Generando más desigualdades en el mercado laboral",
                            "Aumentando la carga de trabajo para los empleados"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué oportunidades puede generar la inteligencia artificial en el trabajo?",
                        options = listOf(
                            "Creación de nuevos empleos y aumento de la productividad",
                            "Reducción de la productividad y el crecimiento económico",
                            "Estancamiento tecnológico",
                            "Desaparición de los empleos tradicionales"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué habilidades son importantes para el futuro del trabajo con la inteligencia artificial?",
                        options = listOf(
                            "Habilidades relevantes, creatividad y capacidad de adaptación",
                            "Conocimientos técnicos específicos de la IA",
                            "Experiencia en empleos tradicionales",
                            "Resistencia al cambio y rigidez"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuál es la importancia de la colaboración entre humanos y sistemas de IA en el trabajo?",
                        options = listOf(
                            "Aprovechar el potencial de la tecnología y garantizar un futuro laboral inclusivo y sostenible",
                            "Sustituir por completo a los trabajadores humanos",
                            "Generar conflictos entre humanos y máquinas",
                            "Eliminar la necesidad de colaboración y comunicación en el trabajo"
                        )
                    )
                ),
                image = R.drawable.futura_del_trabajo
            ),
            ReadingItem(
                id = 13,
                title = "La inteligencia artificial y la privacidad",
                reading = "La inteligencia artificial (IA) plantea desafíos en cuanto a la privacidad de los datos personales. La IA se basa en el análisis de grandes cantidades de datos, lo que puede dar lugar a la recopilación y el uso de información sensible. Es importante proteger la privacidad en el contexto de la IA mediante la implementación de políticas y regulaciones que salvaguarden los datos personales. Además, se deben adoptar medidas de seguridad adecuadas para prevenir el acceso no autorizado a la información. La conciencia sobre los riesgos de privacidad y la educación sobre el uso responsable de la IA son fundamentales para garantizar la protección de la privacidad en un mundo cada vez más impulsado por la tecnología.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué desafíos plantea la inteligencia artificial en cuanto a la privacidad?",
                        options = listOf(
                            "Recopilación y uso de información sensible",
                            "Ausencia de preocupaciones éticas",
                            "Limitación del acceso a la información",
                            "Falta de regulaciones en el uso de datos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cómo se puede proteger la privacidad en el contexto de la inteligencia artificial?",
                        options = listOf(
                            "Implementando políticas y regulaciones que salvaguarden los datos personales",
                            "Compartiendo abiertamente los datos personales sin restricciones",
                            "No recopilando datos personales en absoluto",
                            "Permitiendo el acceso ilimitado a la información"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué medidas de seguridad son importantes para proteger la privacidad en la inteligencia artificial?",
                        options = listOf(
                            "Adopción de medidas de seguridad adecuadas para prevenir el acceso no autorizado",
                            "Eliminar por completo la recopilación de datos",
                            "Permitir el acceso libre a la información sin restricciones",
                            "No tomar ninguna medida de seguridad"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué es fundamental para garantizar la protección de la privacidad en un mundo impulsado por la tecnología?",
                        options = listOf(
                            "Conciencia sobre los riesgos de privacidad y educación sobre el uso responsable de la IA",
                            "Ignorar los riesgos de privacidad y confiar plenamente en la tecnología",
                            "Limitar el acceso a la tecnología",
                            "Eliminar por completo el uso de la inteligencia artificial"
                        )
                    )
                ),
                image = R.drawable.privacidad
            ),
            ReadingItem(
                id = 14,
                title = "El impacto social de la inteligencia artificial",
                reading = "La inteligencia artificial (IA) tiene un impacto significativo en la sociedad, abarcando áreas como el empleo, la educación, la atención médica y la justicia. Por un lado, la IA puede mejorar la eficiencia y la precisión de los procesos, facilitar el acceso a la información y ayudar en la toma de decisiones. Sin embargo, también plantea desafíos, como la automatización de empleos, la brecha digital y la discriminación algorítmica. Es importante considerar el impacto social de la IA y tomar medidas para mitigar los efectos negativos, promover la equidad y garantizar el beneficio para toda la sociedad.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas tiene un impacto la inteligencia artificial?",
                        options = listOf(
                            "Empleo, educación, atención médica, justicia, entre otros",
                            "Solo en el ámbito empresarial",
                            "Limitado al sector tecnológico",
                            "Sin impacto en la sociedad"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en la sociedad?",
                        options = listOf(
                            "Mejora de la eficiencia, acceso a la información y toma de decisiones",
                            "Limitación del acceso a la tecnología",
                            "Aumento de la brecha digital",
                            "Eliminación de empleos tradicionales"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué desafíos plantea la inteligencia artificial en la sociedad?",
                        options = listOf(
                            "Automatización de empleos, brecha digital, discriminación algorítmica",
                            "Aumento de la igualdad de oportunidades",
                            "Mejora de la calidad de vida para todos",
                            "Eliminación de la diversidad en la sociedad"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué medidas se pueden tomar para mitigar los efectos negativos de la inteligencia artificial?",
                        options = listOf(
                            "Promover la equidad, garantizar la transparencia y evitar la discriminación algorítmica",
                            "Fomentar la automatización completa sin regulaciones",
                            "Ignorar los efectos negativos y confiar plenamente en la IA",
                            "Eliminar el uso de la IA en la sociedad"
                        )
                    )
                ),
                image = R.drawable.impacto_social
            ),
            ReadingItem(
                id = 15,
                title = "La ética en la inteligencia artificial",
                reading = "La ética en la inteligencia artificial (IA) se refiere a los principios y valores que guían el desarrollo y uso de sistemas de IA. La IA plantea desafíos éticos debido a su capacidad para tomar decisiones autónomas y su potencial impacto en la sociedad. Algunas cuestiones éticas importantes en la IA incluyen la privacidad, la discriminación algorítmica, la responsabilidad y la transparencia. Es crucial considerar los aspectos éticos en el diseño, implementación y regulación de la IA para garantizar su uso beneficioso y evitar consecuencias negativas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Qué se entiende por ética en la inteligencia artificial?",
                        options = listOf(
                            "Principios y valores que guían el desarrollo y uso de sistemas de IA",
                            "Uso indiscriminado de la tecnología",
                            "Ausencia de consecuencias sociales",
                            "Maximización del beneficio económico"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos éticos en la inteligencia artificial?",
                        options = listOf(
                            "Privacidad, discriminación algorítmica, responsabilidad, transparencia",
                            "Estancamiento tecnológico",
                            "Supremacía de la IA sobre los seres humanos",
                            "Limitaciones técnicas"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante considerar la ética en la inteligencia artificial?",
                        options = listOf(
                            "Para garantizar un uso beneficioso y evitar consecuencias negativas",
                            "Para frenar el desarrollo de la IA",
                            "Para evitar el avance de la tecnología",
                            "Para maximizar el poder de la IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué implicaciones éticas tiene la privacidad en la inteligencia artificial?",
                        options = listOf(
                            "Protección de datos personales y respeto a la privacidad de los individuos",
                            "Violación de la privacidad de las empresas",
                            "Acceso indiscriminado a la información personal",
                            "Uso de datos sin restricciones"
                        )
                    )
                ),
                image = R.drawable.etica_2
            ),
            ReadingItem(
                id = 16,
                title = "La inteligencia artificial en la medicina",
                reading = "La inteligencia artificial (IA) está revolucionando el campo de la medicina. Se utiliza para diagnosticar enfermedades, analizar imágenes médicas, personalizar tratamientos y predecir resultados. La IA puede procesar grandes cantidades de datos y encontrar patrones que los médicos pueden pasar por alto. Esto ayuda a mejorar la precisión del diagnóstico y la eficiencia del tratamiento. Sin embargo, también plantea desafíos éticos y legales, como la privacidad de los datos y la responsabilidad de las decisiones médicas. Es fundamental encontrar un equilibrio entre la tecnología y el juicio clínico humano para garantizar la mejor atención médica posible.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo se aplica la inteligencia artificial en el campo de la medicina?",
                        options = listOf(
                            "Diagnóstico de enfermedades, análisis de imágenes médicas, personalización de tratamientos, predicción de resultados",
                            "Solo en la investigación médica",
                            "Limitado a la atención primaria",
                            "Sin aplicación en la medicina"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué ventajas ofrece la inteligencia artificial en la medicina?",
                        options = listOf(
                            "Mejora de la precisión del diagnóstico y la eficiencia del tratamiento",
                            "Limitación de la capacidad de los médicos",
                            "Aumento de los costos de atención médica",
                            "Eliminación de la necesidad de médicos"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos éticos y legales asociados con la inteligencia artificial en la medicina?",
                        options = listOf(
                            "Privacidad de los datos y responsabilidad de las decisiones médicas",
                            "Ausencia de consideraciones éticas y legales",
                            "Disminución de la autonomía del paciente",
                            "Acceso indiscriminado a información médica personal"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante encontrar un equilibrio entre la inteligencia artificial y el juicio clínico humano?",
                        options = listOf(
                            "Para garantizar la mejor atención médica posible",
                            "Para eliminar por completo la intervención humana en la medicina",
                            "Para limitar la capacidad de los médicos",
                            "Para aumentar los costos de atención médica"
                        )
                    )
                ),
                image = R.drawable.medicina
            ),
            ReadingItem(
                id = 17,
                title = "La inteligencia artificial en la seguridad cibernética",
                reading = "La inteligencia artificial (IA) desempeña un papel crucial en la seguridad cibernética. Se utiliza para identificar y prevenir ataques cibernéticos, detectar patrones de comportamiento malicioso y fortalecer las defensas en línea. La IA puede analizar grandes volúmenes de datos en tiempo real y proporcionar respuestas rápidas a las amenazas. Sin embargo, también presenta desafíos, ya que los ciberdelincuentes pueden utilizar la IA para lanzar ataques más sofisticados. Es fundamental desarrollar una IA robusta y contar con profesionales capacitados en seguridad cibernética para mantener la integridad de los sistemas y proteger la información sensible.",
                questions = listOf(
                    QuestionItem(
                        question = "¿Cómo se utiliza la inteligencia artificial en la seguridad cibernética?",
                        options = listOf(
                            "Identificación y prevención de ataques cibernéticos, detección de patrones maliciosos, fortalecimiento de defensas en línea",
                            "Solo en la detección de malware",
                            "Limitado a la protección de datos personales",
                            "Sin aplicación en la seguridad cibernética"
                        )
                    ),
                    QuestionItem(
                        question = "¿Qué ventajas ofrece la inteligencia artificial en la seguridad cibernética?",
                        options = listOf(
                            "Análisis rápido de grandes volúmenes de datos y respuesta rápida a las amenazas",
                            "Aumento de los ataques cibernéticos",
                            "Disminución de la efectividad de las defensas en línea",
                            "Eliminación de la necesidad de profesionales en seguridad cibernética"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos asociados con el uso de la inteligencia artificial en la seguridad cibernética?",
                        options = listOf(
                            "Uso malicioso de la IA por parte de ciberdelincuentes",
                            "Incapacidad de la IA para detectar amenazas",
                            "Falta de datos para el análisis de IA",
                            "Ausencia de profesionales capacitados en seguridad cibernética"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante desarrollar una IA robusta y contar con profesionales capacitados en seguridad cibernética?",
                        options = listOf(
                            "Para mantener la integridad de los sistemas y proteger la información sensible",
                            "Para aumentar el riesgo de ataques cibernéticos",
                            "Para limitar la efectividad de las defensas en línea",
                            "Para reducir la necesidad de medidas de seguridad cibernética"
                        )
                    )
                ),
                image = R.drawable.seguridad_cibernetica
            ),
            ReadingItem(
                id = 18,
                title = "La inteligencia artificial en el transporte",
                reading = "La inteligencia artificial (IA) está transformando la industria del transporte. Se utiliza en sistemas de navegación, vehículos autónomos y gestión del tráfico. La IA ayuda a mejorar la eficiencia del transporte, reducir accidentes y optimizar las rutas. Los vehículos autónomos son capaces de tomar decisiones en tiempo real y adaptarse a las condiciones del tráfico. Sin embargo, la implementación de la IA en el transporte plantea desafíos, como la seguridad y la aceptación pública. Es fundamental garantizar que los sistemas de IA sean confiables, seguros y estén respaldados por regulaciones adecuadas.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas se aplica la inteligencia artificial en el transporte?",
                        options = listOf(
                            "Sistemas de navegación, vehículos autónomos, gestión del tráfico",
                            "Solo en el transporte público",
                            "Limitado a la logística",
                            "Sin aplicación en el transporte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en el transporte?",
                        options = listOf(
                            "Mejora de la eficiencia, reducción de accidentes, optimización de rutas",
                            "Aumento de la congestión del tráfico",
                            "Limitación de la capacidad de los vehículos",
                            "Incremento de los costos de transporte"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos en la implementación de la inteligencia artificial en el transporte?",
                        options = listOf(
                            "Seguridad y aceptación pública",
                            "Ausencia de mejoras en la eficiencia",
                            "Disminución de la seguridad vial",
                            "Falta de datos para el análisis de IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante garantizar que los sistemas de IA en el transporte sean confiables y seguros?",
                        options = listOf(
                            "Para evitar accidentes y garantizar una experiencia segura",
                            "Para aumentar la congestión del tráfico",
                            "Para limitar la capacidad de los vehículos",
                            "Para reducir la eficiencia del transporte"
                        )
                    )
                ),
                image = R.drawable.transporte
            ),
            ReadingItem(
                id = 19,
                title = "La inteligencia artificial en el sector financiero",
                reading = "La inteligencia artificial (IA) está transformando el sector financiero. Se utiliza para la detección de fraudes, el análisis de riesgos, el comercio automatizado y la atención al cliente. La IA puede analizar grandes volúmenes de datos en tiempo real y tomar decisiones rápidas y precisas. Esto ayuda a mejorar la seguridad y la eficiencia en las transacciones financieras. Sin embargo, también plantea desafíos, como la privacidad de los datos y la discriminación algorítmica. Es fundamental establecer regulaciones adecuadas y salvaguardias éticas para garantizar un uso responsable de la IA en el sector financiero.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas se aplica la inteligencia artificial en el sector financiero?",
                        options = listOf(
                            "Detección de fraudes, análisis de riesgos, comercio automatizado, atención al cliente",
                            "Solo en la gestión de inversiones",
                            "Limitado a la banca tradicional",
                            "Sin aplicación en el sector financiero"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en el sector financiero?",
                        options = listOf(
                            "Mejora de la seguridad y eficiencia en las transacciones financieras",
                            "Aumento de los riesgos financieros",
                            "Disminución de la precisión en el análisis de riesgos",
                            "Eliminación de la necesidad de atención al cliente"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos en la implementación de la inteligencia artificial en el sector financiero?",
                        options = listOf(
                            "Privacidad de los datos y discriminación algorítmica",
                            "Ausencia de mejoras en la seguridad financiera",
                            "Limitaciones técnicas de la IA",
                            "Falta de datos para el análisis de IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante establecer regulaciones adecuadas y salvaguardias éticas en el uso de la inteligencia artificial en el sector financiero?",
                        options = listOf(
                            "Para garantizar un uso responsable de la IA y proteger la privacidad de los datos",
                            "Para aumentar los riesgos financieros",
                            "Para limitar la capacidad de las transacciones financieras",
                            "Para reducir la eficiencia en el sector financiero"
                        )
                    )
                ),
                image = R.drawable.sector_financiero
            ),
            ReadingItem(
                id = 20,
                title = "La inteligencia artificial en la industria manufacturera",
                reading = "La inteligencia artificial (IA) está transformando la industria manufacturera. Se utiliza para mejorar la eficiencia de los procesos de producción, optimizar la cadena de suministro y predecir el mantenimiento de equipos. La IA puede analizar datos en tiempo real y tomar decisiones basadas en patrones y algoritmos. Esto ayuda a reducir los tiempos de producción, minimizar los costos y mejorar la calidad del producto. Sin embargo, también presenta desafíos, como la integración de sistemas y la capacitación de personal. Es fundamental contar con una estrategia de implementación sólida y ofrecer capacitación adecuada para aprovechar al máximo el potencial de la IA en la industria manufacturera.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas se aplica la inteligencia artificial en la industria manufacturera?",
                        options = listOf(
                            "Mejora de la eficiencia de los procesos de producción, optimización de la cadena de suministro, predicción del mantenimiento de equipos",
                            "Solo en el diseño de productos",
                            "Limitado a la gestión de inventario",
                            "Sin aplicación en la industria manufacturera"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en la industria manufacturera?",
                        options = listOf(
                            "Reducción de los tiempos de producción, minimización de los costos, mejora de la calidad del producto",
                            "Aumento de los tiempos de producción",
                            "Disminución de la calidad del producto",
                            "Eliminación de la necesidad de mano de obra"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos en la implementación de la inteligencia artificial en la industria manufacturera?",
                        options = listOf(
                            "Integración de sistemas y capacitación de personal",
                            "Ausencia de mejoras en la eficiencia de producción",
                            "Limitaciones técnicas de la IA",
                            "Falta de datos para el análisis de IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante contar con una estrategia de implementación sólida y ofrecer capacitación adecuada en la inteligencia artificial en la industria manufacturera?",
                        options = listOf(
                            "Para aprovechar al máximo el potencial de la IA y superar los desafíos",
                            "Para aumentar los costos de producción",
                            "Para limitar la eficiencia de los procesos de producción",
                            "Para eliminar la necesidad de mano de obra"
                        )
                    )
                ),
                image = R.drawable.manufactura
            ),
            ReadingItem(
                id = 21,
                title = "La inteligencia artificial en la agricultura",
                reading = "La inteligencia artificial (IA) está revolucionando la agricultura. Se utiliza para optimizar el riego, monitorear la salud de los cultivos y mejorar la eficiencia en la producción de alimentos. La IA puede analizar datos climáticos, imágenes satelitales y sensores agrícolas para brindar información precisa y en tiempo real. Esto ayuda a reducir el uso de recursos, aumentar los rendimientos y prevenir enfermedades en los cultivos. Sin embargo, también plantea desafíos, como el acceso a la tecnología y la capacitación de los agricultores. Es fundamental garantizar que la IA en la agricultura sea accesible y beneficiosa para todos los actores involucrados.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas se aplica la inteligencia artificial en la agricultura?",
                        options = listOf(
                            "Optimización del riego, monitoreo de la salud de los cultivos, mejora de la eficiencia en la producción de alimentos",
                            "Solo en la cosecha de cultivos",
                            "Limitado al control de plagas",
                            "Sin aplicación en la agricultura"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en la agricultura?",
                        options = listOf(
                            "Reducción del uso de recursos, aumento de los rendimientos, prevención de enfermedades en los cultivos",
                            "Aumento del uso de recursos",
                            "Disminución de los rendimientos agrícolas",
                            "Eliminación de la necesidad de mano de obra agrícola"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos en la implementación de la inteligencia artificial en la agricultura?",
                        options = listOf(
                            "Acceso a la tecnología y capacitación de los agricultores",
                            "Ausencia de mejoras en la eficiencia de producción de alimentos",
                            "Limitaciones técnicas de la IA",
                            "Falta de datos para el análisis de IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante garantizar que la inteligencia artificial en la agricultura sea accesible y beneficiosa para todos los actores involucrados?",
                        options = listOf(
                            "Para lograr un desarrollo sostenible y una mayor productividad agrícola",
                            "Para aumentar los costos de producción de alimentos",
                            "Para limitar la eficiencia en la producción de alimentos",
                            "Para eliminar la necesidad de mano de obra agrícola"
                        )
                    )
                ),
                image = R.drawable.agricultura
            ),
            ReadingItem(
                id = 22,
                title = "La inteligencia artificial en el sector energético",
                reading = "La inteligencia artificial (IA) está desempeñando un papel importante en el sector energético. Se utiliza para optimizar la generación y distribución de energía, predecir la demanda y mejorar la eficiencia en los procesos energéticos. La IA puede analizar datos de consumo, patrones climáticos y comportamiento del mercado para tomar decisiones informadas. Esto ayuda a reducir los costos energéticos, minimizar el impacto ambiental y promover la transición hacia fuentes de energía renovable. Sin embargo, también presenta desafíos, como la interoperabilidad de los sistemas y la privacidad de los datos. Es fundamental contar con una infraestructura tecnológica sólida y políticas adecuadas para impulsar el uso efectivo de la IA en el sector energético.",
                questions = listOf(
                    QuestionItem(
                        question = "¿En qué áreas se aplica la inteligencia artificial en el sector energético?",
                        options = listOf(
                            "Optimización de la generación y distribución de energía, predicción de la demanda, mejora de la eficiencia en los procesos energéticos",
                            "Solo en la producción de energía renovable",
                            "Limitado a la gestión de residuos energéticos",
                            "Sin aplicación en el sector energético"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos beneficios de la inteligencia artificial en el sector energético?",
                        options = listOf(
                            "Reducción de los costos energéticos, minimización del impacto ambiental, promoción de la transición hacia fuentes de energía renovable",
                            "Aumento de los costos energéticos",
                            "Incremento del impacto ambiental",
                            "Eliminación de la necesidad de fuentes de energía renovable"
                        )
                    ),
                    QuestionItem(
                        question = "¿Cuáles son algunos desafíos en la implementación de la inteligencia artificial en el sector energético?",
                        options = listOf(
                            "Interoperabilidad de los sistemas y privacidad de los datos",
                            "Ausencia de mejoras en la eficiencia energética",
                            "Limitaciones técnicas de la IA",
                            "Falta de datos para el análisis de IA"
                        )
                    ),
                    QuestionItem(
                        question = "¿Por qué es importante contar con una infraestructura tecnológica sólida y políticas adecuadas en el uso de la inteligencia artificial en el sector energético?",
                        options = listOf(
                            "Para impulsar el uso efectivo de la IA y lograr una transición energética sostenible",
                            "Para aumentar los costos energéticos",
                            "Para limitar la eficiencia en los procesos energéticos",
                            "Para eliminar la necesidad de fuentes de energía renovable"
                        )
                    )
                ),
                image = R.drawable.sector_energetico
            )
        )
    }
}