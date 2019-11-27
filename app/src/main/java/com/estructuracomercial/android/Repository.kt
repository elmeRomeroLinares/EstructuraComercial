package com.estructuracomercial.android

class Repository() {

    fun getCentrosComercialesGrandes(): List<Local> {
        val ccgMutableList = mutableListOf<Local>()

        ccgMutableList.add(
            Local(
                "https://multiplaza-samantha.s3.amazonaws.com/uploads/mall_image/image/18/mobile_Fachada_2.jpg",
                "Multiplaza Panamericana",
                "Antiguo Cuscatlán, San Salvador.",
                "115 mil m².",
                "6 (3 Subterráneos).",
                "Carretera Panamericana 503, San Salvador.",
                "250",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."

            )
        )

        ccgMutableList.add(
            Local(
                "https://alcaldiass.files.wordpress.com/2010/01/galeriasescalon.jpg?w=530&h=409",
                "Centro Comercial Galerías.",
                "San Salvador, San Salvador.",
                "220 mil m².",
                "7 (3 Subterráneos).",
                "Paseo General Escalón #3700, San Salvador.",
                "144",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."

            )
        )

        ccgMutableList.add(
            Local(
                "https://www.lagranvia.com.sv/images/headers/4_home.jpg",
                "La Gran Vía",
                "Antiguo Cuscatlán, La Libertad.",
                "130 mil m².",
                "4 (4 niveles de parqueo, 2 parqueos adicionales).",
                "Carretera Panamericana y, Calle Chiltiupan, Cd Merliot.",
                "100",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccgMutableList.add(
            Local(
                "https://live.staticflickr.com/206/524104510_e3c85ec2bb_b.jpg",
                "Plaza Merliot",
                "Santa Tecla, La Libertad.",
                "220 mil m².",
                "3 (1 Subterráneos).",
                "Calle Chiltiupán y 17 Av. Norte, Santa Tecla.",
                "155",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccgMutableList.add(
            Local(
                "https://cronio.sv/wp-content/uploads/2018/12/23517552_1378859825558566_3410542942159289492_n-300x202.jpg",
                "Plaza Centro",
                "San Salvador, San Salvador.",
                "1,200 m².",
                "6 (2 Subterráneos).",
                "San Salvador, San Salvador.",
                "50",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccgMutableList.add(
            Local(
                "https://villadelangelhotel.com/wp-content/uploads/2016/12/Plaza-Futura-El-Salvador.png",
                "Plaza Futura",
                "Colonia Escalón, San Salvador.",
                "3,000 mil m².",
                "4 (2 Subterráneos).",
                "Complejo World Trade Center Torre Futura Nivel 16 Calle Al Mirador Y 87 Avenida Norte.",
                "25",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Plaza Futura predominan negocios de restaurantes."
            )
        )

        ccgMutableList.add(
            Local(
                "https://live.staticflickr.com/7535/16249810972_371123e3f0_b.jpg",
                "Plaza Mundo",
                "Soyapango, San Salvador.",
                "149 mil m².",
                "5 (3 Subterráneos).",
                "Boulevard del Ejercito km. 4 1/2 y Calle Montecarmelo.",
                "350",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccgMutableList.add(
            Local(
                "https://ladrilloslascruces.com/wp-content/uploads/2015/04/hiper-mall-cascadas-salvador-01-459x343-1430177196.jpg",
                "Mall Cascadas",
                "Antiguo Cuscatlán, La Libertad.",
                "42,253.5 mil m².",
                "3 (1 Subterráneos).",
                "Kilómetro 12, Carretera al Puerto de La Libertad",
                "241",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial El Paseo predominan negocios de restaurantes y de conveniencia."
            )
        )

        return ccgMutableList.toList()
    }

    fun getCentrosComercialesPequenos(): List<Local> {
        val ccpMutableList = mutableListOf<Local>()

        ccpMutableList.add(
            Local(
                "http://santatecla.gob.sv/travel/img/section/2-2.jpg",
                "La Skina",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "16 Avenida Norte, Finca Santa Rosa.",
                "26",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial La Skina predominan negocios de restaurantes."
            )
        )

        ccpMutableList.add(
            Local(
                "https://live.staticflickr.com/4841/33147026788_f8766f6c56_b.jpg",
                "Santa Rosa",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "Intercepción de Calle Real, 9a. Calle Pte y Bld. Monseñor Romero.",
                "35",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Santa Rosa predominan negocios de conveniencia."
            )
        )

        ccpMutableList.add(
            Local(
                "https://elsalvadoreshermoso.com/wp-content/uploads/2014/05/plaza-madero-tiendas.jpg",
                "Plaza Madero",
                "Santa Elena, La Libertad.",
                "-",
                "-",
                "Boulevar Santa Elena, calle Alegría poniente #7, Antiguo Cuscatlán.",
                "22",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Plaza Madero predominan negocios de restaurantes."
            )
        )

        ccpMutableList.add(
            Local(
                "https://farm5.static.flickr.com/4877/46857308542_f6ed361aa6.jpg",
                "Olivos Plaza",
                "Colonia San Benito, San Salvador.",
                "-",
                "-",
                "Colonia San Benito y Av. La Capilla #705.",
                "12",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Olivos Plaza predominan negocios de restaurantes."
            )
        )

        ccpMutableList.add(
            Local(
                "https://live.staticflickr.com/7867/47169296352_aaeaf41d53_b.jpg",
                "Plaza Malta",
                "Antiguo Cuscatlán, La Libertad.",
                "-",
                "-",
                "Boulevard Orden de Malta y carretera al Puerto de La Libertad.",
                "31",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Plaza Malta predominan negocios de conveniencia."
            )
        )

        ccpMutableList.add(
            Local(
                "https://i.pinimg.com/originals/84/82/4b/84824b5a4eab94f739388ed8befe2729.jpg",
                "Las Palmas",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "Kilómetro 12 1/2 Carretera al Puerto de La Libertad.",
                "20",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial Las Palmas predominan negocios de restaurantes."
            )
        )

        ccpMutableList.add(
            Local(
                "https://live.staticflickr.com/8459/8001386753_0f4a035d0c_b.jpg",
                "La Joya",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "Kilómetro 12, Carretera al Puerto de La Libertad",
                "50",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial La Joya predominan negocios de conveniencia."
            )
        )

        ccpMutableList.add(
            Local(
                "https://static.elmundo.sv/wp-content/uploads/2017/11/El-Paseo.jpg",
                "El Paseo",
                "San Salvador, San Salvador.",
                "-",
                "-",
                "Paseo General Escalón, San Salvador.",
                "29",
                "Centro Comercial Especializado: Están presentes aquellos comercios donde se ofrecer cierta actividad específica. En el centro comercial El Paseo predominan negocios de conveniencia."
            )
        )

        return ccpMutableList.toList()
    }

    fun getCentrosComercialesRegionales(): List<Local>{
        val ccrMutableList = mutableListOf<Local>()

        ccrMutableList.add(
            Local(
                "https://metrocentro-samantha.s3.amazonaws.com/uploads/custom_seo/image/18/CEO-Metro-SS.jpg",
                "Metrocentro San Salvador",
                "San Salvador, San Salvador.",
                "Más de 240 mil m².",
                "4 (1 Subterráneos).",
                "Boulevard de Los Héroes, colonia Miramonte.",
                "Más de 760",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccrMutableList.add(
            Local(
                "https://metrocentro-samantha.s3.amazonaws.com/uploads/mall_slide/image/19/1920x768_01.jpg",
                "Metrocentro San Ana",
                "Santa Ana, Santa Ana.",
                "15,323 m².",
                "2",
                "Colonia Loma Linda, final avenida Independencia Sur y by pass.",
                "90",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        ccrMutableList.add(
            Local(
                "https://i.pinimg.com/originals/d3/3f/45/d33f4528385e77c9c36ea038878c343b.jpg",
                "Metrocentro San Miguel",
                "San Miguel, San Miguel.",
                "30 mil m².",
                "2 (1 Subterráneo).",
                "Carretera Panamericana, 30 avenida Sur.",
                "151",
                "Centro Comercial Integrado: Están presentes medianas superficies especializadas y grandes superficies juntos con pequeños comercios, además de ofrecer actividades lúdicas y de ocio."
            )
        )

        return ccrMutableList.toList()
    }


}