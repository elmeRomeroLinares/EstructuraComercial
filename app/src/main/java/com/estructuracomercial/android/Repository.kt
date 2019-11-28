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

    fun getCentrosComercialesRegionales(): List<Local> {
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

    fun getMercadosMunicipales(): List<Local> {
        val mmMutableList = mutableListOf<Local>()

        mmMutableList.add(
            Local(
                "https://scontent-mia3-1.xx.fbcdn.net/v/t1.0-9/26114027_142546439864921_5460473400953807645_n.jpg?_nc_cat=104&_nc_ohc=npQEc5aNXycAQlVoTXdN-O5kA9cF5RWxiq82QiYA7kByVvOzbG9KuB0Lw&_nc_ht=scontent-mia3-1.xx&oh=fd507b3dfa62ce9d76f559ae758a364b&oe=5E489760",
                "Mercado San Miguelito",
                "San Salvador, San Salvador.",
                "-",
                "-",
                "Av. España y 23 Calle Oriente, Barrio San Miguelito.",
                "1,252",
                "Mercado Municicpal: Los mercados están formados por puestos individuales que ofrecen productos de diversa índole con predominancia de los productos frescos: carne, frutas, verduras, pescado, etc. Se instalan en el centro de los barrios o localidades."
            )
        )

        mmMutableList.add(
            Local(
                "https://fastly.4sqi.net/img/general/600x600/6415510_2PBZnZNR-QyCM_qXbPFcQXG3pvalxo6Ge7z9-K_mWpE.jpg",
                "Mercado Dueñas",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "1 Avenida Norte 2-5, Santa Tecla.",
                "-",
                "-"
            )
        )

        mmMutableList.add(
            Local(
                "https://i1.wp.com/www.solonoticias.com/wp-content/uploads/LA-TIENDONA.jpg?fit=552%2C368&ssl=1",
                "La Tiendona",
                "San Salvador, San Salvador.",
                "-",
                "-",
                "Frente al reloj de flores, San Salvador.",
                "-",
                "-"
            )
        )

        return mmMutableList.toList()
    }

    fun getAlmacenDeMultiplesSucursales(): List<Local> {
        val amsMutableList = mutableListOf<Local>()

        amsMutableList.add(
            Local(
                "https://i.imgur.com/qwfy64k.jpg",
                "Sportline América",
                "Santa Elena, La Libertad.",
                "-",
                "-",
                "9° Calle Poniente N°3935 entre 75 y 77 Av. Norte, Colonia Escalón, San Salvador El Salvador.",
                "8 sucursales",
                "Almacén de sucursales múltiples: venta de marcas reconocidas del mundo del deporte como son Nike, Adidas, Under Armour, Speedo y de accesorios como FitBit."
            )
        )

        amsMutableList.add(
            Local(
                "http://directorio.laprensagrafica.com/wp-content/uploads/2017/05/juguar.jpg",
                "Jaguar Sportic",
                "San Salvador, El Salvador",
                "-",
                "-",
                "75 avenida norte 9a y calle poniente, no. 3906, colonia escalón.",
                "19 sucursales",
                "Almacén de sucursales múltiples: tienda especializada en la fabricación y distribución de accesorios y ropa deportiva de su propia marca y de marcas reconocidas a nivel mundial."
            )
        )

        amsMutableList.add(
            Local(
                "https://scontent-mia3-1.xx.fbcdn.net/v/t1.0-9/74612450_3073521559342943_5015887598267138048_n.jpg?_nc_cat=106&_nc_ohc=B-l4eqqMuqUAQl3-Cw_qkxt6tw-2Tm5Eh9K-GickKeJK5k0UKiCONTSJQ&_nc_ht=scontent-mia3-1.xx&oh=754ad8c8bf15f331f5390f05d98668b1&oe=5E819EDA",
                "Galaxia deportes",
                "San Salvador, El Salvador",
                "-",
                "-",
                "Metrocentro, Torre Roble, Local 68ª",
                "4 y 25 diferentes marcas",
                "Almacén de sucursales múltiples: Fabricante de uniformes deportivos de la mejor calidad, con experiencia de 40 años en el mercado nacional, capaz de diseño personalizado y con los mejores materiales importados."
            )
        )

        amsMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2018/05/3-13-1.jpg",
                "Prado El Salvador",
                "San José, Costa Rica",
                "-",
                "-",
                "Oficinas centrales San José Costa Rica",
                "Metrocentro 4ta, 8va y 11va etapa",
                "Almacén de sucursales múltiples: venta al detalle de muebles, electrodomésticos y tecnología para los segmentos medios y bajos en El Salvador."
            )
        )

        amsMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2019/08/Curacao-03.jpg",
                "La Curacao",
                "San Salvador, El Salvador",
                "-",
                "-",
                "Alameda Manuel Enrique Araujo, edificio Unicomer.",
                "37 sucursales",
                "Almacén de sucursales múltiples: venta al detalle de muebles, electrodomésticos y tecnología, motocicletas y servicios financieros."
            )
        )

        amsMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2018/06/Prisma-Moda.jpg",
                "Prima Moda",
                "Santa Tecla, La Libertad",
                "-",
                "-",
                "Centro Comercial Plaza Merliot, tercer nivel, Locales #303 y # 304.",
                "11 sucursales",
                "Almacén de sucursales múltiples: Prisma Moda es una marca de Unicomer El Salvador, opera varias cadenas de marcas minoristas, se especializa en audio, video, electrodomésticos."
            )
        )

        amsMutableList.add(
            Local(
                "http://grupounicomer.com/wp-content/uploads/2019/01/banner_tropigas.jpg",
                "Almacenes Tropigas",
                "San Salvador, El Salvador",
                "-",
                "-",
                "Alameda Manuel Enrique Araujo, edificio Unicomer.",
                "2 sucursales",
                "Almacén de sucursales múltiples: Tropigas es una marca de Unicomer El Salvador, opera varias cadenas de marcas minoristas, se especializa en audio, video, electrodomésticos."
            )
        )

        return amsMutableList.toList()
    }

    fun getAlmacenesGrandes(): List<Local> {
        val agMutableList = mutableListOf<Local>()

        agMutableList.add(
            Local(
                "https://medias.fashionnetwork.com/image/upload/v1/medias/c09870b72830ad26a21164d757f5fb322021865.jpg",
                "Simán",
                "Antiguo Cuscatlán, La Libertad.",
                "-",
                "2",
                "C. Panamericana Calle Chiltiupan, Centro Comercial La Gran Vía Local #1.",
                "7 sucursales",
                "Grandes Almacenes: Es un establecimiento de gran superficie que ofrece al público toda clase de mercancías, por lo que se encuentra dividido en 17 departamentos diferentes."
            )
        )

        agMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2018/02/sears-arre.jpg",
                "Sears",
                "Antiguo Cuscatlán, La Libertad.",
                "-",
                "2",
                "Centro Comercial Multiplaza, Carretera Panamericana.",
                "1 sucursales",
                "Grandes Almacenes: Es un establecimiento de gran superficie que ofrece al público toda clase de mercancías, por lo que se encuentra dividido en 5 departamentos diferentes."
            )
        )

        agMutableList.add(
            Local(
                "https://www.vidri.com.sv/themes/default/img/f0ee3727cf8070fcd380376008e74aa9.jpg",
                "Almacenes Vidrí",
                "Antiguo Cuscatlán, La Libertad.",
                "-",
                "-",
                "Boulevard Merliot y carretera al puerto de la libertad.",
                "16 sucursales",
                "Grandes Almacenes: Es un establecimiento de gran superficie que ofrece al público toda clase de mercancías, por lo que se encuentra dividido en 9 departamentos diferentes."
            )
        )

        agMutableList.add(
            Local(
                "https://www.tendencias.mx/wp-content/uploads/2018/10/sanborns.jpg",
                "Sanborns",
                "Antiguo Cuscatlán, La Libertad.",
                "-",
                "-",
                "Centro Comercial Multiplaza, Carretera Panamericana.",
                "2 sucursales",
                "Grandes Almacenes: Es un establecimiento de gran superficie que ofrece al público toda clase de mercancías, por lo que se encuentra dividido en 14 departamentos diferentes."
            )
        )

        agMutableList.add(
            Local(
                "https://si.wsj.net/public/resources/images/BN-VK764_office_HD_20171004131856.jpg",
                "Office Depot",
                "San Salvador, San Salvador.",
                "-",
                "-",
                "Paseo General Escalón entre 83 y 85 av. Sur.",
                "3 sucursales",
                "Grandes Almacenes: Es un establecimiento de gran superficie que ofrece al público toda clase de mercancías, por lo que se encuentra dividido en 8 departamentos diferentes."
            )
        )

        return agMutableList.toList()
    }

    fun getAlmacenesPopulares(): List<Local> {
        val apMutableList = mutableListOf<Local>()

        apMutableList.add(
            Local(
                "http://cdn3.clasificados.com/sv/pictures/photos/000/045/008/original_Logo.jpg",
                "Almacenes BOMBA",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "2°C. Ote. No. 1-6 frente a mercado de Santa Tecla.",
                "19 sucursales, 20 departamentos, 6 marcas propias",
                "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Almacenes bomba: Los servicios y productos que ofrecen están orientados a satisfacer las necesidades de sus clientes con precios bajos, los productos que predominan son: Ropa para dama, caballero, niños, bebes y productos para el hogar.\n"
            )
        )

        apMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2017/01/27015241/1434881416961.jpg",
                "Variedades Génesis",
                "Casa matriz, San Salvador",
                "-",
                "-",
                "6a. Calle oriente #124, San salvador.",
                "11 sucursales",
                "Productos: Ropa, calzado, juguetes, cristalería, artículos del hogar, artículos para bebé, herramientas y más.\n" +
                        "\n" +
                        "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Variedades Génesis: Empresa #1 en la distribución y comercialización de artículos importados.\n"
            )
        )

        apMutableList.add(
            Local(
                "https://yt3.ggpht.com/a-/AN66SAwx6aw1Z8Mw13BG9ZvSNBOc5XQdgkGD62IVwg=s900-mo-c-c0xffffffff-rj-k-no",
                "Mega boutique",
                "San Salvador, El Salvador.",
                "-",
                "-",
                "Distrito Comercial Central, 3ra Calle Poniente #938, entre 15 y, 17 Avenida Nte, San Salvador.",
                "1 sucursal",
                "Productos: Ropa, calzado, accesorios, bisutería, carteras, zapatos y más.\n" +
                        "\n" +
                        "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Mega boutique: Empresa con una historia de más de 20 años que ha marcado la pauta en el país, para la comercialización de artículos de primera y segunda mano de alta calidad, que tiene como objetivo principal el brindar la mejor experiencia de compras online con artículos de primera y segunda mano, con precios accesibles a través de su página web.\n"
            )
        )

        apMutableList.add(
            Local(
                "https://lh3.googleusercontent.com/p/AF1QipO_uBchUhxEJO6orPcXIOEeXNFg7HrkkcCHGHE-=s1600-w400",
                "Premium center",
                "El salvador.",
                "-",
                "-",
                "Cd. Merliot, frente a centro comercial el trébol.",
                "27 sucursales",
                "Productos: Ropa para toda la familia, accesorios, artículos para el hogar, juguetes, muebles y más.\n" +
                        "\n" +
                        "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Premium center: En Premium Center El Salvador ofrecen productos desde ropa para toda la familia, accesorios, artículos para el hogar, juguetes hasta muebles; todo bajo la garantía 100% americana. Brindan una experiencia de compra con promociones todos los días para que gastes menos y compres más SIEMPRE.\n"
            )
        )

        apMutableList.add(
            Local(
                "https://metrocentro-samantha.s3.amazonaws.com/uploads/post/logo_v2/5573/Logo.jpg",
                "Almacenes Santa Lucía",
                "Santa Tecla, La Libertad.",
                "-",
                "-",
                "2°C. Ote. No. 1-6 frente a mercado de Santa Tecla.",
                "19 sucursales",
                "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Almacenes Santa Lucía: Se dedica a la venta de ropa, calzado y accesorios para toda la familia, ofreciendo los mejores precios y estilos en el mercado durante 27 años.\n"
            )
        )

        apMutableList.add(
            Local(
                "https://i.ytimg.com/vi/CAwUdzL8yxM/maxresdefault.jpg",
                "Almacenes Shopping center",
                "San Salvador, El Salvador.",
                "-",
                "-",
                "11 Avenida Sur 4 calle poniente No. 238, San Salvador.",
                "8 sucursales",
                "Productos: Ropa, zapatos, carteras, Juguetes, Peluches, joyería, accesorios y más.\n" +
                        "\n" +
                        "Almacén popular: Es una tienda por departamento de menor tamaño que el gran almacén que está especializada en línea de productos de calidad inferior y venden a precios bajos.\n" +
                        "\n" +
                        "Shopping Center:  El almacén número uno de ropa americana en El Salvador, Siempre se ha interesado en cubrir los gustos más exigentes de sus clientes ofreciéndoles lo mejor, en cuanto a calidad, marcas y una amplia cantidad y variedad de ropa, zapatos, carteras, juguetes, peluches, joyería, accesorios y más.\n"
            )
        )

        return apMutableList.toList()
    }

    fun getSuperMercados(): List<Local> {
        val smMutableList = mutableListOf<Local>()

        smMutableList.add(
            Local(
                "https://i.ytimg.com/vi/lz1DzF8-Ztk/maxresdefault.jpg",
                "Super Selectos",
                "San Salvador, El Salvador",
                "-",
                "-",
                "San Salvador, El Salvador",
                "100 sucursales",
                "-"
            )
        )

        smMutableList.add(
            Local(
                "https://cdn-pro.elsalvador.com/wp-content/uploads/2017/01/26204948/1434796484570.jpg",
                "Despensa de Don Juan",
                "San Salvador, El Salvador",
                "-",
                "-",
                "Centro Comercial Las Terrazas",
                "20 sucursales",
                "-"
            )
        )

        smMutableList.add(
            Local(
                "https://static.elmundo.sv/wp-content/uploads/2018/10/Maxi-Despensa-Ahuachapan.jpg",
                "Maxi Despensa",
                "Lourdes Colon, La Libertad",
                "-",
                "-",
                "Campos Verdes, Lourdes Colon",
                "15 sucursales",
                "-"
            )
        )

        return smMutableList.toList()
    }

    fun getHiperMercado(): List<Local> {
        val hmMutableList = mutableListOf<Local>()

        hmMutableList.add(
            Local(
                "https://www.pymnts.com/wp-content/uploads/2016/08/Walmart-To-Buy-Jet.jpg",
                "Wallmart",
                "San Salvador, San Salvador",
                "-",
                "-",
                "Entre Boulevard Orden de Malta, calle Izalco, Antiguo Cuscatlán , La Libertad.",
                "5 sucursales",
                "-"
            )
        )

        return hmMutableList.toList()
    }
}