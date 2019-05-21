import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import pylab

df = pd.read_csv('train.csv', index_col=0)
y = df['SalePrice']
x = df['YearBuilt']
plt.scatter(x,y)
plt.show()