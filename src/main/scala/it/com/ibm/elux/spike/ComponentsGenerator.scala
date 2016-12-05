package it.com.ibm.elux.spike

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  *
  */
object ComponentsGenerator
{

    def userSelectionsGenerator: Array[Property] =
        this.generator(WMGrammar.userSelectionComponents)

    def programParametersGenerator: Array[Property] =
        this.generator(WMGrammar.programParametersComponents)

    private def generator(components: mutable.LinkedHashMap[String, String]): Array[Property] =
    {

        val propertyList = new ListBuffer[Property]()

        for ((kv, index) <- components.zipWithIndex)
        {

            val property = new Property(index)
            property.setName(kv._2)

            property.setValue( if (kv._1.contains('.'))
                Property.getRandomBoolean
            else
                Property.getRandom
            )

            propertyList.append(property)

        }

        propertyList.toArray

    }

}
