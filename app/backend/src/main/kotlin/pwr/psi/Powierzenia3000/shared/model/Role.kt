package pwr.psi.Powierzenia3000.shared.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Role(var rolename: String = "") {

    @Id
    @GeneratedValue
    val id: Long? = null
}