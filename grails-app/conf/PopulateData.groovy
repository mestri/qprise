/**
 *
 * @author onix
 */

import net.xioh.qprise.currency.*
import net.xioh.qprise.security.*

class PopulateData {


//    def fillData() {
//        println "------------------ POPULATE qPrise DATA ------------------"
//
//        println " -- Test DATA -- "
//
//        15.times {
//            def moneda = Currency.build(isoCode:'BO', description: 'Boliviano')
//        }
//    }

    def fillData(authenticateService) {
        println " -- Roles -- "
        def userAuth = new Role(authority:"ROLE_USER", description: "Authenticated User").save()
        def su = new Role(authority:"ROLE_ADMIN", description: "Administrator Role").save()

        println " -- Users -- "
        def pass = authenticateService.encodePassword('sesamo')

        def person = new User(username: "user", userRealName: "Joseph Nusairat",
            email: "jnusairat@integrallis.com", description: "Joseph's Account",
            passwd: pass, enabled: true).save()

        def admin = new User(username: "admin", userRealName: "Administrator",
            email: "cjudd@juddsolutions.com", description: "Our admin",
            passwd: pass, enabled: true).save()

        userAuth.addToPeople(person)
        su.addToPeople(admin)

        println " -- Request Maps -- "
        new Requestmap(url:"/**",configAttribute:"ROLE_ADMIN").save()
        new Requestmap(url:"/login/*",configAttribute:"ROLE_ADMIN, ROLE_USER, ROLE_ANONYMOUS").save()
        new Requestmap(url:"/logout/*",configAttribute:"ROLE_ADMIN, ROLE_USER, ROLE_ANONYMOUS").save()
    }

       
}
