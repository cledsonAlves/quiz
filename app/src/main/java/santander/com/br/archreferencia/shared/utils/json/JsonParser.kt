package santander.com.br.archreferencia.shared.utils.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonIOException

/**
 * Created by cledson.alves on 19/12/2017.
 */

class JsonParser {

    fun fromJson(json: String, typeClass: Class<*>): Any? {
        try {
            return gsonBuilder!!.create().fromJson(json, typeClass)
        } catch (ex: JsonIOException) {
            return null
        }

    }

    companion object {
        private var gsonBuilder: GsonBuilder? = null

        val gsonDefault: Gson
            get() {
                gsonBuilder = GsonBuilder()
                gsonBuilder!!.setDateFormat("dd/MM/yyyy")
                gsonBuilder!!.setLenient()
                return gsonBuilder!!.create()
            }
    }


}