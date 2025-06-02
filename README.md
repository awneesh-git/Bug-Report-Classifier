## ABSTRACT
We target the problem of software bug reports classification. Our 
main aim is to build a classifier that is capable of classifying 
newly incoming bug reports into two predefined classes: 
corrective (defect fixing) report and perfective (major 
maintenance) report. This helps maintainers to quickly understand 
these bug reports and hence, allocate resources for each category. 
For this purpose, we propose a distinctive feature set that is based 
on the occurrences of certain keywords. The proposed feature set 
is then fed into a number of classification algorithms for building 
a classification model. The results of the proposed feature set 
achieved high accuracy in classification with SVM classification 
algorithm reporting an average accuracy of (93.1%) on three 
different open source projects
## CCS Concepts
## Software and its engineering➝ Maintaining software.
## 1.INTRODUCTION AND RELATED WORK
Bug tracking systems are used as a centralized medium for 
communication between users and developers where users or 
developers submit bug reports for potential help in fixing these 
bugs.
A number of issues arise in dealing with reports including:
bug duplicates, bug severity assessment, bug triage, and bug 
classification into categories. Usually, these issues are dealt with 
in a manual inspection way which is difficult to be done as of the 
large number of bug reports to be considered. This has motivated 
researchers to build automated systems that can tackle the 
aforementioned issues. For example, the authors in [1] dealt with 
building an automated system for finding bug duplicates. In the 
work of [2], the authors suggested a number of techniques for 
automated severity assessment. Also, there has been an effort 
spent in targeting the problem of automated bug triage or bug 
assignment (e.g. [3]). 
Recently, there has been an extensive research in relation to the 
area of automated bug reports classification. It aims to 
distinguishing bug reports into predefined set of categories 
(classes). The automated way of classification saves great time 
and effort and helps in reducing uncertainty and improve costeffectiveness by planning ahead and pre-allocating resources
towards source code maintenance [4]. The most common 
categories of bug reports are: corrective and perfective. Corrective 
reports deal with fixing defects that are related to errors, flaws and 
defects in the software. On the other hand, perfective reports are 
related to new enhancements and features to improve system 
performance. 
This work extends a number of research works in the area of 
automated classification of software bug reports. For example, the 
authors in [5] classified issue reports into two classes: bug or 
none-bug. They proposed an approach that uses the whole 
document term matrix of three separate projects as a feature set. 
The feature set is fed into a number classification algorithms: 
naïve Byes, linear discriminant analysis, k-nearest neighbors, 
support vector machine, decision trees and random forests. A 
comparison is carried out between the performance of these 
classifiers and random forests perform best. Similar to the 
aforementioned work, the authors in [6], used 1800 issue reports 
from Mozilla, Eclipse and Jboss projects to build a classification 
model for discriminating between a bug and a non-bug categories. 
Manual labeling is used for initial categorizing of reports. Three 
classification algorithms are implemented: naïve Bayes, ADTree 
and logistic regression. The average accuracy ranges between 
77% and 82%. Recently, the authors in [7] targeted a similar 
problem of classification of bug reports into: bug or none-bug 
classes. They proposed a multilayer approach that combines text 
mining and data mining. The approach is tested on three open 
source projects and an accuracy ranging between 76.1% - 93.1% 
has been reported. 
Recently, an attention has been paid to modelling data with a 
probabilistic model for data representation. For example, the 
authors in [8] applied a topic modeling approach for classifying 
bug reports into two classes: bugs or other requests. 
A probabilistic generative model, Latent Dirichlet Allocation, is 
used for representing documents.
A comparison is carried out on three projects and using three classification algorithms and the 
results are encouraging.
A similar approach to that of [8] has been applied by the authors in [9], [10], [11] and [12]. 
A number of related research works has targeted the area of
multiclass classification of software maintenance requests (e.g. 
[13] and [4]). In the work of [13], maintenance requests are 
classified into five different classes: corrective, adaptive, 
perfective, feature addition, and non-functional. 
A dataset is built based on word distributions and is fed into five different 
algorithms. Generally, accuracy results are over 50%. The authors 
in [4] proposed to incorporate word frequencies features with 
source code changes for the purpose of classifying maintenance
requests into three categories: adaptive, corrective, and perfective. 
The proposed approach achieved an accuracy of 76% when tested 
on 11 open source projects. 
In this work, we target the problem automated classification of 
software bug reports. We aim at building a classifier that can 
accurately classify newly coming bug reports into: corrective or 
perfective classes. Different from the previous works, we propose 
a new feature set that is based on the occurrences of certain 
keywords rather than using the whole document term matrix. This 
is more efficient in terms of training time. The performance of the 
proposed feature set is proven by testing it on three projects and 
across a number of classification algorithms. The research 
contributions in this paper are:
• An efficient classifier to automatically classify newly 
reported bug reports.
• A small yet representative feature set that can accurately 
classify corrective and perfective bug reports. 
The rest of this paper is organized as follows: In section 2, we 
explain the proposed approach part. Section 3 presents the 
experimental results. Finally, section 4 concludes the paper and suggests future work.
![Screenshot_2-6-2025_132414_](https://github.com/user-attachments/assets/6252b812-777b-4d25-97bf-06951b734501)


