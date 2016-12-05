package it.com.ibm.elux.spike

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  *
  */
object ComponentsGenerator
{

    def userSelectionsGenerator: Array[Component] =
        this.generator(WMGrammar.userSelectionComponents)

    private def generator(components: mutable.LinkedHashMap[String, String]): Array[Component] =
    {

        val propertyList = new ListBuffer[Component]()

        for ((kv, index) <- components.zipWithIndex)
        {

            val property = new Component(index)
            property.setName(kv._2)

            property.setValue( if (kv._1.contains('.'))
                Component.getRandomBoolean
            else
                Component.getRandom
            )

            propertyList.append(property)

        }

        propertyList.toArray

    }

    def programParametersGenerator: Array[Component] =
        this.generator(WMGrammar.programParametersComponents)

}
