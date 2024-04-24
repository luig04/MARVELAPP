package com.adso.marvelapp.data

import com.adso.marvelapp.modelo.Superheroe

class DataSource {
    fun getSuperHeroes():MutableList<Superheroe> {
        var superheroes: MutableList<Superheroe> = mutableListOf()


        superheroes.add(Superheroe("Spiderman","marvel","peter","https://i.ebayimg.com/images/g/O-sAAOSwfY5lFU0w/s-l1600.jpg"))
        superheroes.add(Superheroe("Thor","marvel","thor odinson","https://static.wikia.nocookie.net/marvelcinematicuniverse/images/0/0b/Thor.png/revision/latest?cb=20230122204800&path-prefix=es"))
        superheroes.add(Superheroe("Flash","DC","jay garrick","https://www.serietotaal.nl/images/nieuws/t/cwfc31mrztfy-600x338.jpg"))
        superheroes.add(Superheroe("Green","DC","alan","https://www.serietotaal.nl/images/nieuws/t/863uxf7w108x-600x338.jpg"))
        superheroes.add(Superheroe("Daredevil","marvel","matthew","https://m.media-amazon.com/images/I/91zXY3YTBfL._AC_SY879_.jpg"))
        superheroes.add(Superheroe("Hulk","marvel","Bruce Banner","https://img.freepik.com/fotos-premium/bebe-disfrazado-hulk-verde_1340-33370.jpg?w=360"))
        superheroes.add(Superheroe("Black Widow","marvel"," Natasha Romanoff","https://upload.wikimedia.org/wikipedia/commons/0/00/Scarlett_Johansson_-_Captain_America_2_press_conference_%28retouched%29_2.jpg"))
        superheroes.add(Superheroe("Capitán América","marvel"," Steven ","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Chris_Evans_SDCC_2014_%282%29.jpg/800px-Chris_Evans_SDCC_2014_%282%29.jpg"))
        superheroes.add(Superheroe("Deadpool","marvel","Wade Winston Wilson","https://e.rpp-noticias.io/xlarge/2020/05/18/345934_943539.jpg"))
        superheroes.add(Superheroe("SuperMan","DC","Clark Kent","https://i.seadn.io/gae/BMFVCGfVui3px33pI3aturTsOOq7ec0wF9PdtfAXfavp8JDSMpJKc88_7ZLWK2uoP8Z_PhTrfdAUOxFUJ6m49LhWTeC57w9Ypb3v_g?auto=format&dpr=1&w=1920"))

     return superheroes
    }
}