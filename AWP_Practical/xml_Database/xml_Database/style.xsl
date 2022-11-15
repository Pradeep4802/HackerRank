<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
>

    <xsl:template match="/">
      <html>
      <head>
      </head>
        <body>
          <xsl:for-each select="students/student">
            <h1>
              <xsl:value-of select="sname"/>
            </h1>
            <p>
              <xsl:value-of select="rollno"/>
            </p>
            <hr/>
          </xsl:for-each>
        </body>
      </html>
      
    </xsl:template>
</xsl:stylesheet>
